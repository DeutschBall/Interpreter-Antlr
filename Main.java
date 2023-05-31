import common.*;
import gui.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.awt.*;

public class Main {
    private static FrontEnd front;
    private static BackEnd back;
    private static BaseUI ui;



    public static void main(String[] args) {



//        (Graphics2D)getGraphics();


        front=new FrontEnd("./in.dat");
        try{
            front.doParse();
            ParseTree tree=front.getTree();

            ui=new MyWindow();

            back=new BackEnd(tree, ui);
//            back.wait(10000);
            ui.beginPaint();
            back.run();
            ui.endPaint(true);
//            back.wait(100);

//            Thread.sleep(10000);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
