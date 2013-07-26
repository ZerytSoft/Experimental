package tk.zeryter.main.GUI;

import java.awt.*;

public class Canvas extends java.awt.Canvas {

    public void paint(Graphics g){
        System.out.println("paint");

        double rot = Math.PI/4;
        double rotadd = Math.PI/240000;

        for(;;){

            clear(g);

            triangle(g,200,200,rot);

            rot = rot + rotadd;

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }

        }

    }


    public void triangle(Graphics g,int x,int y,double rotation){

        int[] xPos = {x + (int) (5*Math.sqrt(5)*Math.cos(rotation + (5*Math.PI)/4)),x + (int) (10*Math.cos(rotation)),x + (int) (5*Math.sqrt(5)*Math.cos(rotation + (3*Math.PI)/4))};
        int[] yPos = {y + (int) (5*Math.sqrt(5)*Math.sin(rotation + (5 * Math.PI) / 4)),y + (int) (10*Math.sin(rotation)),y + (int) (5*Math.sqrt(5)*Math.sin(rotation + (3 * Math.PI) / 4))};

        //int[] xPos = {,,};
        //int[] yPos = {,,};

        g.fillPolygon(xPos,yPos,3);

        //g.drawLine((int)(50*Math.sqrt(5)*Math.cos(rotation + (5*Math.PI)/4)),y + (int) (50*Math.sqrt(5)*Math.sin(rotation + (5 * Math.PI) / 4)),x,y);
        //g.drawLine((int)(100*Math.cos(rotation + (5*Math.PI)/4)),y + (int) (100*Math.sin(rotation + (5 * Math.PI) / 4)),x,y);
        //g.drawLine((int)(50*Math.sqrt(5)*Math.cos(rotation + (5*Math.PI)/4)),y + (int) (50*Math.sqrt(5)*Math.sin(rotation + (3 * Math.PI) / 4)),x,y);

    }

    public void clear(Graphics g){

        g.clearRect(0,0,getWidth(),getHeight());

    }

}