package tk.zeryter.main.GUI;

import java.awt.*;

public class Canvas extends java.awt.Canvas {

    public void paint(Graphics g){

        g.fillRect(0,0,getWidth(),getHeight()/2);

    }

}