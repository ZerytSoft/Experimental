package tk.zeryter.gltriangle;

import tk.zeryter.gltriangle.Window.Render;
import tk.zeryter.gltriangle.Window.Window;

public class GLTriangleMain {

    public static void main(String[] args){

        //new Thread(new Window()).start();

        new Thread(new Render()).start();

    }

}
