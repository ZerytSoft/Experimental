package zeryt.main;

//#########################################
//Owen Holloway
//ZerytSoft ... open source for the future
//#########################################

import java.io.*;

public class Main {

    static String test;

    static Boolean cont;

    public static void main(String args[]) throws IOException, InterruptedException {

        System.out.println("Welcome to the Zeryt Tech AI");
        System.out.println("infdev 0.1");

        cont = false;
        test = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (!(cont)) {

            System.out.print("Input: ");
            test = br.readLine();
            if(test == "exit") cont = true;
            else System.out.println("Test '" + test + "'");

        }

    }

}
