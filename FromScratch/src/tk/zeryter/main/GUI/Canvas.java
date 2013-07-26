package tk.zeryter.main.GUI;

import java.awt.*;
import java.util.EventListener;

import tk.zeryter.main.GUI.UIElements.*;

public class Canvas extends java.awt.Canvas {

    zButton test;

    public void paint(Graphics g){
        System.out.println("paint");

        clear(g);

        addMouseMotionListener(test);
        addMouseListener(test);

        test = new zButton();
        test.setBounds(10,10,100,50);
        test.draw(g);

    }

    public void clear(Graphics g){

        g.clearRect(0,0,getWidth(),getHeight());

    }

}