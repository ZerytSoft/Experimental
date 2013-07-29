package tk.zeryter.gltriangle;

import tk.zeryter.gltriangle.Window.Render;
import tk.zeryter.gltriangle.Window.Window;

public class GLTriangleMain {

    public static Render renderMain = new Render();

    public static void main(String[] args){

        //new Thread(new Window()).start();

        new Thread(renderMain).start();

    }

}
