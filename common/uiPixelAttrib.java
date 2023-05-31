package common;
// import java.awt.*;
// import javax.swing.*;

public class uiPixelAttrib {
    private double r;

    private double g;
    private double b;
//    private double s;
    public uiPixelAttrib(double r,double g,double b) {
        this.r=r;
        this.g=g;
        this.b=b;
    }
    public uiPixelAttrib() {
        r=g=b=0;
    }
    public final double red(){
        return r;
    }
    public final double green(){
        return g;
    }
    public final double blue(){
        return b;
    }
    public final double size(){
        return 5;
    }
//    public void setSize(double s){
//        this.s=s;
//    }
}
