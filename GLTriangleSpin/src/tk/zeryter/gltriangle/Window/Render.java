package tk.zeryter.gltriangle.Window;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import tk.zeryter.gltriangle.Input;

public class Render implements Runnable {

    public double rotation = Math.PI / 2;
    public double rotationAdd = Math.PI / 24000000;

    public boolean rendering = true;

    public void run() {
        render();
    }

    public void render() {

        DisplayMode displayMode = new DisplayMode(950, 650);

        try {
            Display.setDisplayMode(displayMode);  //This creates a new windows for OpenGL to be drawn on
            Display.create();
            Display.setTitle("GLTriangle");
            //Display.setResizable(true);


        } catch (LWJGLException e) {
            e.printStackTrace();
            System.exit(10);

        }

        // init OpenGL here
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glLoadIdentity();
        GL11.glOrtho(0, Display.getWidth(), 0, Display.getHeight(), 1, -1);    //This sets up the render space for open GL pixW is width pixH is Height
        GL11.glMatrixMode(GL11.GL_MODELVIEW);

        try {
            Keyboard.create();
        } catch (LWJGLException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        new Thread(new Input()).start();

        while (!Display.isCloseRequested()) {

            int currentHeight = Display.getHeight(), currentWidth = Display.getWidth();

            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);      //Clears the render space

            triangle(Display.getWidth() / 2, Display.getHeight() / 2, rotation);

            Display.update();

            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
            /*
            if (!(currentHeight == Display.getHeight()) | !(currentWidth == Display.getWidth())) {

                displayMode = new DisplayMode(Display.getWidth(), Display.getHeight());

                GL11.glMatrixMode(GL11.GL_PROJECTION);
                GL11.glLoadIdentity();
                GL11.glOrtho(0, Display.getWidth(), 0, Display.getHeight(), 1, -1);    //This sets up the render space for open GL pixW is width pixH is Height
                GL11.glMatrixMode(GL11.GL_MODELVIEW);
            }
            */

        }

        rendering = false;

        Display.destroy();

    }

    public void triangle(int x, int y, double rotation) {

        int[] xPos = {x + (int) (7 * Math.sqrt(5) * Math.cos(rotation + (5 * Math.PI) / 4)), x + (int) (15 * Math.cos(rotation)), x + (int) (7 * Math.sqrt(5) * Math.cos(rotation + (3 * Math.PI) / 4))};
        int[] yPos = {y + (int) (7 * Math.sqrt(5) * Math.sin(rotation + (5 * Math.PI) / 4)), y + (int) (15 * Math.sin(rotation)), y + (int) (7 * Math.sqrt(5) * Math.sin(rotation + (3 * Math.PI) / 4))};

        GL11.glColor3d(0,1,0);

        GL11.glBegin(GL11.GL_TRIANGLES);
        GL11.glVertex2i(xPos[0], yPos[0]);
        GL11.glVertex2i(xPos[1], yPos[1]);
        GL11.glVertex2i(xPos[2], yPos[2]);
        GL11.glEnd();
    }
}
