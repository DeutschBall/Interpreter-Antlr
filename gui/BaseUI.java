package gui;
import common.*;
public interface BaseUI {
    



	public void reportError(String msg);
	
	public void showMessage(String msg);
	


	public void drawPixel(double x, double y, uiPixelAttrib pa);

    public void setTree(org.antlr.v4.runtime.tree.ParseTree tree, String[] ruleNames);

    public void beginPaint();

    public void endPaint(boolean noError);

//    public void setSize(double s);
}
