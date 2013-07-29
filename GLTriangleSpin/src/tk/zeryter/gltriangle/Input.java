package tk.zeryter.gltriangle;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;


public class Input implements Runnable {

    public void run() {



        while (GLTriangleMain.renderMain.rendering) {

            if (Keyboard.isKeyDown(Keyboard.KEY_D)) {

                GLTriangleMain.renderMain.rotation = GLTriangleMain.renderMain.rotation - GLTriangleMain.renderMain.rotationAdd;

            }

            if (Keyboard.isKeyDown(Keyboard.KEY_A)) {

                GLTriangleMain.renderMain.rotation = GLTriangleMain.renderMain.rotation + GLTriangleMain.renderMain.rotationAdd;

            }
        }
    }

}
