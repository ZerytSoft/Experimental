package tk.zeryter.main.GUI.UIElements;

import java.awt.*;
import java.awt.event.*;

public class zButton extends java.awt.Canvas implements MouseListener, MouseMotionListener {

    int x, y, width, height;

    int state;

    Graphics t;

    public void draw(Graphics g){

        t = g;

        System.out.println("button draw");

        System.out.println("state: " + state);

        switch (state){

            case 0:

                g.setColor(Color.darkGray);

                g.fillRect(x,y,width,height);

                g.setColor(Color.WHITE);

                g.fillRect(x+5,y+5,width-10,height-10);

                break;

            case 1:

                g.setColor(Color.darkGray);

                g.fillRect(x,y,width,height);

                g.setColor(Color.gray);

                g.fillRect(x+5,y+5,width-10,height-10);

                break;

        }


    }

    public void setBounds(int xSet,int ySet,int widthSet,int heightSet){

        x = xSet;
        y = ySet;
        width = widthSet;
        height = heightSet;

    }

    public void mouseClicked(MouseEvent e) {

        int xMouse = e.getX();
        int yMouse = e.getY();

        System.out.println("xMouse: " + xMouse);
        System.out.println("yMouse: " + yMouse);


        if (xMouse > x && xMouse < x + width && yMouse > y && yMouse < y + width){
            state = 0;
            System.out.println("state0");
        }
        else {
            state = 1;
            System.out.println("state1");
        }

        System.out.println("state: " + state);

    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
    }

    public void mouseMoved(MouseEvent e) {
    }
}
