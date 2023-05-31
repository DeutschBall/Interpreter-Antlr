//import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import gui.*;
public class BackEnd {
    protected ParseTree tree = null;
    protected BaseUI theUI = null;

    public BackEnd(ParseTree t, BaseUI ui) {
        tree = t;
        theUI = ui;
    }


    public void run() {
        EvalVisitor eval =new EvalVisitor();
        eval.setUI(theUI);
        eval.visit(tree);
    }

}
