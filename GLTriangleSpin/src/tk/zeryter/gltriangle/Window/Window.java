package tk.zeryter.gltriangle.Window;

import java.awt.*;

public class Window implements Runnable{

    public static Canvas canvas;

    public void run() {

        canvas = new Canvas();

        Frame window = new Frame("PlaceHolderText");
        window.add(canvas);
        window.setSize(400,400);

        window.setVisible(true);
        window.addWindowListener(new WindowMonitor());

    }
}