

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import common.*;
import gui.*;

import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends DrawGraphBaseVisitor<Double>
{
    BaseUI    theUI       =new MyWindow();
	Map<String,Double> map = new HashMap<>();
    public EvalVisitor()
    {
    }
    
    public void setUI(BaseUI ui)
    {
        theUI = ui;        
    }

    private double valueOfT =0;
    private double originX =0;
    private double originY =0; 
    private double scaleX =1;
    private double scaleY =1;
    private double rotate =0;
    private uiPixelAttrib  pixelAttrib = new uiPixelAttrib();


	@Override public Double visitProgram(DrawGraphParser.ProgramContext ctx) { return visitChildren(ctx); }

	@Override public Double visitStatement(DrawGraphParser.StatementContext ctx) { return visitChildren(ctx); }

	@Override public Double visitStatOrigin(DrawGraphParser.StatOriginContext ctx) {
	    originX = visit( ctx.expr(0) );
	    originY = visit( ctx.expr(1) );
	    return 0.0;
	}
	
	@Override public Double visitStatScale(DrawGraphParser.StatScaleContext ctx) {
	    scaleX = visit( ctx.expr(0) );
	    scaleY = visit( ctx.expr(1) );
	    return 0.0;
	}
	
	@Override public Double visitStatRot(DrawGraphParser.StatRotContext ctx) {
	    return rotate = visit( ctx.expr() );
	}
	
	@Override public Double visitStatFor(DrawGraphParser.StatForContext ctx) {
	    if(pixelAttrib == null) pixelAttrib = new uiPixelAttrib();
	    double Tbegin = visit( ctx.expr(0));
	    double Tend   = visit( ctx.expr(1));
	    double Tstep  = visit( ctx.expr(2));
//		if(Math.abs(right)<0.00001){
//			Token tk = ctx.DIV().getSymbol();
//			theUI.showMessage("error " + tk.getLine() + ":"
//					+ tk.getCharPositionInLine()
//					+ " divided by zero '" );
//			value = 0;
//		}
		Token tk=ctx.STEP().getSymbol();
		if(Math.abs(Tstep)<0.00001){
			theUI.showMessage("warning: " + tk.getLine() + ":" + tk.getCharPositionInLine() + " step should be none zero");

			if(Tbegin<Tend){
				Tstep=1;
			}
			else{

				Tstep=-1;
			}
		}
		if(Tbegin<Tend){
			if(Tstep<0) {
				theUI.showMessage("warning: " + tk.getLine() + ":" + tk.getCharPositionInLine() + " step should be a positive when begin is less than end");
				Tstep=-Tstep;
			}
		}
		else {
			if(Tstep>0){
				theUI.showMessage("warning: " + tk.getLine() + ":" + tk.getCharPositionInLine() + " step should be a negetive when begin is less than end");
				Tstep=-Tstep;
			}
		}
//		if(Tstep<0||Tstep<)
		if(Tstep>0){
			for(valueOfT = Tbegin; valueOfT <Tend; valueOfT += Tstep)
			{
				double x = visit( ctx.expr(3) );
				double y = visit( ctx.expr(4) );

				x *= scaleX; y *= scaleY;
				double tmp;
				tmp = x*Math.cos(rotate) + y*Math.sin(rotate);
				y = y*Math.cos(rotate)-x*Math.sin(rotate);
				x = tmp;
				x+=originX; y+=originY;
				theUI.drawPixel(x, y, pixelAttrib);
			}
		}
		if(Tstep<0){
			for(valueOfT = Tbegin; valueOfT >Tend; valueOfT += Tstep)
			{
				double x = visit( ctx.expr(3) );
				double y = visit( ctx.expr(4) );

				x *= scaleX; y *= scaleY;
				double tmp;
				tmp = x*Math.cos(rotate) + y*Math.sin(rotate);
				y = y*Math.cos(rotate)-x*Math.sin(rotate);
				x = tmp;
				x+=originX; y+=originY;
				theUI.drawPixel(x, y, pixelAttrib);
			}
		}
		return 0.0;
	}
	
	@Override public Double visitStatColor(DrawGraphParser.StatColorContext ctx) {
	    TerminalNode node = ctx.RED();
	    if(node != null) {
	        pixelAttrib.setColor(255,0,0);
	        return 0.0;
	    }
	    
	    node = ctx.GREEN();
	    if(node != null) {
			pixelAttrib.setColor(0,255,0);
	        return 0.0;
	    }
	    node = ctx.BLUE();
	    if(node != null) {
			pixelAttrib.setColor(0,0,255);
	        return 0.0;
	    }

	    node = ctx.BLACK();
	    if(node != null) {
	        pixelAttrib.setColor(0, 0, 0);
	        return 0.0;
	    }
	    node=ctx.COLORFUL();
		if(node!=null){
			pixelAttrib.setColor(Double.NEGATIVE_INFINITY,Double.NEGATIVE_INFINITY,Double.NEGATIVE_INFINITY);
			return 0.0;
		}
		node=ctx.WHITE();
		if(node!=null){
			pixelAttrib.setColor(255,255,255);
			return 0.0;
		}
	    double r = visit( ctx.expr(0) );
	    double g = visit( ctx.expr(1) );
	    double b = visit( ctx.expr(2) );
		if(r>=0&&r<=255&&g>=0&&g<=255&&b>=0&&b<=255){
			pixelAttrib.setColor(r, g, b);
		}
		else{
			Token tk=ctx.COLOR().getSymbol();
			theUI.showMessage("warning: " + tk.getLine() + ":" + tk.getCharPositionInLine() + " Color([0~255],[0~255],[0~255])");
			pixelAttrib.setColor(255,255,255);
		}
  	    return 0.0;
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
	    double left  = visit( ctx.expr(0) );
	    double right = visit( ctx.expr(1) );
	    return Math.pow(left, right);
	}

	@Override public Double visitMulDivExpr(DrawGraphParser.MulDivExprContext ctx) {
	    double left  = visit( ctx.expr(0) );
	    double right = visit( ctx.expr(1) );
	    double value = 0;
	    if( ctx.MUL() != null ) value = left * right;
	    else {
			if(Math.abs(right)<0.00001){
				Token tk = ctx.DIV().getSymbol();
				theUI.showMessage("error " + tk.getLine() + ":"
						+ tk.getCharPositionInLine()
						+ " divided by zero '" );
				value = 0;
			}
			else{
				value=left/right;
			}
		}

	    return value;
	}
	@Override public Double visitPlusMinusExpr(DrawGraphParser.PlusMinusExprContext ctx) {
	    double left  = visit( ctx.expr(0) );
	    double right = visit( ctx.expr(1) );
	    double value = 0;

	    if( ctx.PLUS() != null ) value = left + right;
	    else value = left - right;

	    return value;
	}
	
	@Override public Double visitNestedExpr(DrawGraphParser.NestedExprContext ctx) {
	    return visit(ctx.expr()); 
	}

	@Override public Double visitUnaryExpr(DrawGraphParser.UnaryExprContext ctx) {
	    double value = visit( ctx.expr() );
	    if( ctx.PLUS() == null ) value = -1 * value;
	    return value;
	}
	
	@Override public Double visitFuncExpr(DrawGraphParser.FuncExprContext ctx) 
	{
	    Token id = ctx.ID().getSymbol();
	    String funcName = id.getText().toLowerCase();
	    double value = 0;
	    double param = visit(ctx.expr());
	    if(funcName.equals("sin")) value = Math.sin(param);
	    else if(funcName.equals("cos")) value = Math.cos(param);
		else if(funcName.equals("ln")) value=Math.log(param);
		else if(funcName.equals("lg")) value=Math.log10(param);
	    else {
	        theUI.showMessage("error " + id.getLine() + ":" 
	               + id.getCharPositionInLine()
	               + "  ��֧�ֵĺ����� '" + funcName  +"'" );
	    }

	    return value; 
	}

	@Override
	public Double visitStatSize(DrawGraphParser.StatSizeContext ctx) {
		pixelAttrib.setSize(visit(ctx.expr()));
		return super.visitStatSize(ctx);
	}

	@Override
	public Double visitStatVar(DrawGraphParser.StatVarContext ctx) {
//		String[] tokenNames = DrawGraphParser.tokenNames;
		String variable=ctx.ID().getText();
//		for(String token:tokenNames){
//			if(token.equals(variable)){
//				System.out.println("syntax reserved");
//				return 0.0;
//			}
//		}

//		if()
		double value=visit(ctx.expr());
		map.put(variable,value);

		return super.visitStatVar(ctx);
	}

	@Override
	public Double visitVarExpr(DrawGraphParser.VarExprContext ctx) {
		String variable=ctx.getText();
		if(map.containsKey(variable)){
			return map.get(variable);
		}
		else{
			map.put(variable,0.0);
			return 0.0;
		}
	}

}
