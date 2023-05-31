/* ���Ķ������������е� �������ࡣ
 * �� BackEnd ���� Visitor ģʽ���ʷ�����ʱ��
 * ��ʹ������ļ��е��� EvalVisitor ��
 * �Ա��ڱ�����ʱ�ص����ﶨ��Ĳ�����
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

    // �����ʽʹ�õ��������
    private double valueOfT =0; // for ����У�ѭ������ T �ĵ�ǰֵ
    private double originX =0; // ����ƽ�Ʋ���
    private double originY =0; 
    private double scaleX =1;  // ������������
    private double scaleY =1;  // ������������
    private double rotate =0;  // ��ת�Ƕ�
    private uiPixelAttrib  pixelAttrib = new uiPixelAttrib(); //���ص������


//
// �����������˸���ķ���
//

	//�����������ø÷�����ֱ�Ӽ̳м��ɡ������Ϊʾ��
	@Override public Double visitProgram(DrawGraphParser.ProgramContext ctx) { return visitChildren(ctx); }
	//�����������ø÷�����ֱ�Ӽ̳м��ɡ������Ϊʾ��
	@Override public Double visitStatement(DrawGraphParser.StatementContext ctx) { return visitChildren(ctx); }

	@Override public Double visitStatOrigin(DrawGraphParser.StatOriginContext ctx) {
	    originX = visit( ctx.expr(0) );
	    originY = visit( ctx.expr(1) );
	    return 0.0; // ����ֵ������
	}
	
	@Override public Double visitStatScale(DrawGraphParser.StatScaleContext ctx) {
	    scaleX = visit( ctx.expr(0) );
	    scaleY = visit( ctx.expr(1) );
	    return 0.0; // ����ֵ������
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
            // ������������õ�ǰ���߼�����
			double x = visit( ctx.expr(3) );
			double y = visit( ctx.expr(4) );

			x *= scaleX; y *= scaleY;           // �ȱ����任
			double tmp;
			tmp = x*Math.cos(rotate) + y*Math.sin(rotate); // ����ת�任
			y = y*Math.cos(rotate)-x*Math.sin(rotate);
			x = tmp;
			x+=originX; y+=originY;             // ���ƽ�Ʊ任
			theUI.drawPixel(x, y, pixelAttrib);
		}
//		theUI.endPaint(true);
		return 0.0; // ����ֵ������
	}
	
	// ������ɫ
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
  	    return 0.0; // ����ֵ������
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
	               + "  ��֧�ֵĳ����� '" + vName  +"'" );
	            value = 0;
	        }
	    }
        return value; 
	}
	
	@Override public Double visitPowerExpr(DrawGraphParser.PowerExprContext ctx) {
	    double left  = visit( ctx.expr(0) ); // ���������ֵ
	    double right = visit( ctx.expr(1) ); // �Ҳ�������ֵ
	    return Math.pow(left, right);
	}

	@Override public Double visitMulDivExpr(DrawGraphParser.MulDivExprContext ctx) {
	    double left  = visit( ctx.expr(0) ); // ���������ֵ
	    double right = visit( ctx.expr(1) ); // �Ҳ�������ֵ
	    double value = 0;

	    if( ctx.MUL() != null ) value = left * right;
	    else value = left / right;

	    return value;
	}
	@Override public Double visitPlusMinusExpr(DrawGraphParser.PlusMinusExprContext ctx) {
	    double left  = visit( ctx.expr(0) ); // ���������ֵ
	    double right = visit( ctx.expr(1) ); // �Ҳ�������ֵ
	    double value = 0;

	    if( ctx.PLUS() != null ) value = left + right;
	    else value = left - right;

	    return value;
	}
	
	@Override public Double visitNestedExpr(DrawGraphParser.NestedExprContext ctx) {
	    return visit(ctx.expr()); 
	}

	@Override public Double visitUnaryExpr(DrawGraphParser.UnaryExprContext ctx) {
	    double value = visit( ctx.expr() ); // ��������ֵ
	    if( ctx.PLUS() == null ) value = -1 * value;
	    return value;
	}
	
	@Override public Double visitFuncExpr(DrawGraphParser.FuncExprContext ctx) 
	{
	    Token id = ctx.ID().getSymbol();
	    String funcName = id.getText().toLowerCase();
	    double value = 0;
	    double param = visit(ctx.expr());  // �������õĲ���ֵ
	    if(funcName.equals("sin")) value = Math.sin(param);
	    else if(funcName.equals("cos")) value = Math.cos(param);
	    // else 
	    //     if ֧�ֵ����������Ĵ���
	    else {
	        theUI.showMessage("error " + id.getLine() + ":" 
	               + id.getCharPositionInLine()
	               + "  ��֧�ֵĺ����� '" + funcName  +"'" );
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
