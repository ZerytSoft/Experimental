package tk.zeryter.main.GUI;

import java.awt.Frame;

public class Window implements Runnable{

    public void run() {

        Frame window = new Frame("PlaceHolderText");
        window.add(new Canvas());
        window.setSize(800,600);
        window.setVisible(true);
        window.addWindowListener(new WindowMonitor());

    }
}