package tk.zeryter.main.GUI;

import java.awt.*;
import java.awt.image.*;

public class Canvas extends java.awt.Canvas {

    Image test;

    public void paint(Graphics g){

        test = Toolkit.getDefaultToolkit().getImage("assets/test.png");

        g.drawImage(test,10,10,this);
        g.drawLine(0,getHeight()/2,getWidth(),getHeight()/2);
    }

}
