package common;
// import java.awt.*;
// import javax.swing.*;

import java.awt.*;

public class uiPixelAttrib {
    private double r;

    private double g;
    private double b;
    private double s;
    public uiPixelAttrib(){
        r=255;
        g=255;
        b=255;
        s=5;
    }

    public uiPixelAttrib(double r,double g,double b,double s) {
        this.r=r;
        this.g=g;
        this.b=b;
        this.s=s;
    }

    public final double red(){
        if(r==Double.NEGATIVE_INFINITY){
            return 255*Math.random();
        }
        return r;
    }
    public final double green(){
        if(g==Double.NEGATIVE_INFINITY){
            return 255*Math.random();
        }
        return g;
    }
    public final double blue(){
        if(b==Double.NEGATIVE_INFINITY){
            return 255*Math.random();
        }
        return b;
    }
    public final double size(){
        return s;
    }
    public void setSize(double s){
        this.s=s;
    }
    public void setColor(double r,double g,double b){
        this.r=r;
        this.g=g;
        this.b=b;
    }

}
