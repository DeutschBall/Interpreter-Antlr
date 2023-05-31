/* 本文定义解释器后端中的 访问者类。
 * 当 BackEnd 采用 Visitor 模式访问分析树时，
 * 将使用这个文件中的类 EvalVisitor ，
 * 以便在遍历树时回调这里定义的操作。
*/


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import common.*;
import gui.*;


public class EvalVisitor extends DrawGraphBaseVisitor<Double>
{
    BaseUI    theUI       =new MyWindow();
    
    public EvalVisitor()
    {
    }
    
    public void setUI(BaseUI ui)
    {
        theUI = ui;        
    }

    // 跨产生式使用的语义变量
    private double valueOfT =0; // for 语句中，循环变量 T 的当前值
    private double originX =0; // 坐标平移参数
    private double originY =0; 
    private double scaleX =1;  // 横向缩放因子
    private double scaleY =1;  // 纵向缩放因子
    private double rotate =0;  // 旋转角度
    private uiPixelAttrib  pixelAttrib = new uiPixelAttrib(); //像素点的属性


//
// 下面是重置了父类的方法
//

	//这里无需重置该方法，直接继承即可。这里仅为示意
	@Override public Double visitProgram(DrawGraphParser.ProgramContext ctx) { return visitChildren(ctx); }
	//这里无需重置该方法，直接继承即可。这里仅为示意
	@Override public Double visitStatement(DrawGraphParser.StatementContext ctx) { return visitChildren(ctx); }

	@Override public Double visitStatOrigin(DrawGraphParser.StatOriginContext ctx) {
	    originX = visit( ctx.expr(0) );
	    originY = visit( ctx.expr(1) );
	    return 0.0; // 返回值无意义
	}
	
	@Override public Double visitStatScale(DrawGraphParser.StatScaleContext ctx) {
	    scaleX = visit( ctx.expr(0) );
	    scaleY = visit( ctx.expr(1) );
	    return 0.0; // 返回值无意义
	}
	
	@Override public Double visitStatRot(DrawGraphParser.StatRotContext ctx) {
	    return rotate = visit( ctx.expr() );
	}
	
	@Override public Double visitStatFor(DrawGraphParser.StatForContext ctx) {
	    if(pixelAttrib == null) pixelAttrib = new uiPixelAttrib();
	    double Tbegin = visit( ctx.expr(0));
	    double Tend   = visit( ctx.expr(1));
	    double Tstep  = visit( ctx.expr(2));
//		theUI.beginPaint();
	    for(valueOfT = Tbegin; valueOfT <Tend; valueOfT += Tstep)
	    {	        
            // 遍历子树，获得当前的逻辑坐标
			double x = visit( ctx.expr(3) );
			double y = visit( ctx.expr(4) );

			x *= scaleX; y *= scaleY;           // 先比例变换
			double tmp;
			tmp = x*Math.cos(rotate) + y*Math.sin(rotate); // 再旋转变换
			y = y*Math.cos(rotate)-x*Math.sin(rotate);
			x = tmp;
			x+=originX; y+=originY;             // 最后平移变换
			theUI.drawPixel(x, y, pixelAttrib);
		}
//		theUI.endPaint(true);
		return 0.0; // 返回值无意义
	}
	
	// 设置颜色
	@Override public Double visitStatColor(DrawGraphParser.StatColorContext ctx) {
	    TerminalNode node = ctx.RED();
	    if(node != null) {
	        pixelAttrib = new uiPixelAttrib(255, 0, 0);
	        return 0.0;
	    }
	    
	    node = ctx.GREEN();
	    if(node != null) {
	        pixelAttrib = new uiPixelAttrib(0, 255, 0);
	        return 0.0;
	    }
	    node = ctx.BLUE();
	    if(node != null) {
	        pixelAttrib = new uiPixelAttrib(0, 0, 255);
	        return 0.0;
	    }

	    node = ctx.BLACK();
	    if(node != null) {
	        pixelAttrib = new uiPixelAttrib(0, 0, 0);
	        return 0.0;
	    }
	    
	    double r = visit( ctx.expr(0) );
	    double g = visit( ctx.expr(1) );
	    double b = visit( ctx.expr(2) );
    	    
  	    pixelAttrib = new uiPixelAttrib(r, g, b);
  	    return 0.0; // 返回值无意义
    }


	@Override public Double visitVarT(DrawGraphParser.VarTContext ctx) {
	     return valueOfT; 
	}
	@Override public Double visitConst(DrawGraphParser.ConstContext ctx) {
	    Token tk = ctx.CONST_ID().getSymbol();
	    String vName = tk.getText().toLowerCase();
	    double value = 0.0;
	    
	    if(vName.equals("pi")){
			value = Math.PI; //3.1415926
		}else if(vName.equals("e")){
			value=Math.E;
		}else {
	        try {
	           value = Double.valueOf(vName);
	        } catch(Exception e) {
	            theUI.showMessage("error " + tk.getLine() + ":" 
	               + tk.getCharPositionInLine()
	               + "  不支持的常量名 '" + vName  +"'" );
	            value = 0;
	        }
	    }
        return value; 
	}
	
	@Override public Double visitPowerExpr(DrawGraphParser.PowerExprContext ctx) {
	    double left  = visit( ctx.expr(0) ); // 左操作数的值
	    double right = visit( ctx.expr(1) ); // 右操作数的值
	    return Math.pow(left, right);
	}

	@Override public Double visitMulDivExpr(DrawGraphParser.MulDivExprContext ctx) {
	    double left  = visit( ctx.expr(0) ); // 左操作数的值
	    double right = visit( ctx.expr(1) ); // 右操作数的值
	    double value = 0;

	    if( ctx.MUL() != null ) value = left * right;
	    else value = left / right;

	    return value;
	}
	@Override public Double visitPlusMinusExpr(DrawGraphParser.PlusMinusExprContext ctx) {
	    double left  = visit( ctx.expr(0) ); // 左操作数的值
	    double right = visit( ctx.expr(1) ); // 右操作数的值
	    double value = 0;

	    if( ctx.PLUS() != null ) value = left + right;
	    else value = left - right;

	    return value;
	}
	
	@Override public Double visitNestedExpr(DrawGraphParser.NestedExprContext ctx) {
	    return visit(ctx.expr()); 
	}

	@Override public Double visitUnaryExpr(DrawGraphParser.UnaryExprContext ctx) {
	    double value = visit( ctx.expr() ); // 操作数的值
	    if( ctx.PLUS() == null ) value = -1 * value;
	    return value;
	}
	
	@Override public Double visitFuncExpr(DrawGraphParser.FuncExprContext ctx) 
	{
	    Token id = ctx.ID().getSymbol();
	    String funcName = id.getText().toLowerCase();
	    double value = 0;
	    double param = visit(ctx.expr());  // 函数调用的参数值
	    if(funcName.equals("sin")) value = Math.sin(param);
	    else if(funcName.equals("cos")) value = Math.cos(param);
	    // else 
	    //     if 支持的其他函数的处理
	    else {
	        theUI.showMessage("error " + id.getLine() + ":" 
	               + id.getCharPositionInLine()
	               + "  不支持的函数名 '" + funcName  +"'" );
	    }

	    return value; 
	}


//	@Override
//	public Double visitStatSize(DrawGraphParser.StatSizeContext ctx) {
//	public Double visitStatSize(DrawGraphParser.StatSizeContext ctx) {
////		return super.visitStatSize(ctx);
//		double size=visit(ctx.expr());
////		theUI.
////		theUI.setSize(size);
////		return size;
////		theUI.
//
//		return 0.0;
//	}
}
