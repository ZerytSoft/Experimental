package tk.zeryter.main;

import tk.zeryter.main.GUI.Window;

public class Main {

    public static void main(String[] args){

        new Thread(new Window()).start();

    }

}
