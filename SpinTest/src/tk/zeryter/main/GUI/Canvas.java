package tk.zeryter.main.GUI;

import java.awt.*;

public class Canvas extends java.awt.Canvas implements Runnable {

    public void paint(Graphics g){
        System.out.println("paint");

        double rot = Math.PI/4;
        double rotadd = Math.PI/240;

        for(;;){

            clear(g);

            triangle(g,200,200,rot);

            rot = rot + rotadd;

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }

        }

    }


    public void triangle(Graphics g,int x,int y,double rotation){

        int[] xPos = {x + (int) (5*Math.sqrt(5)*Math.cos(rotation + (5*Math.PI)/4)),x + (int) (10*Math.cos(rotation)),x + (int) (5*Math.sqrt(5)*Math.cos(rotation + (3*Math.PI)/4))};
        int[] yPos = {y + (int) (5*Math.sqrt(5)*Math.sin(rotation + (5 * Math.PI) / 4)),y + (int) (10*Math.sin(rotation)),y + (int) (5*Math.sqrt(5)*Math.sin(rotation + (3 * Math.PI) / 4))};

        g.fillPolygon(xPos,yPos,3);
    }

    public void clear(Graphics g){

        g.clearRect(0,0,getWidth(),getHeight());

    }

    public void run() {
        paint(getGraphics());
    }
}