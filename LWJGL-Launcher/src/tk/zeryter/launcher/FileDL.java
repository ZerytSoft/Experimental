package tk.zeryter.launcher;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;

public class FileDL {

    URL url;
    URLConnection con;
    DataInputStream dis;
    FileOutputStream fos;

    double completed;

    public void downloadFile(String httplocation, String savelocation) {

        byte[] fileData;
        try {
            url = new URL(httplocation); //File Location goes here
            con = url.openConnection(); // open the url connection.
            dis = new DataInputStream(con.getInputStream());
            fileData = new byte[con.getContentLength()];
            completed = 0;
            int fileLength = fileData.length;
            for (int q = 0; q < fileLength; q++) {
                fileData[q] = dis.readByte();
                System.out.println("Download completed: " + (q + 1) + "/" + fileLength);
            }

            dis.close(); // close the data input stream
            fos = new FileOutputStream(new File(savelocation)); //FILE Save Location goes here
            fos.write(fileData);  // write out the file we want to save.
            fos.close(); // close the output stream writer
        } catch (Exception m) {
            System.out.println(m);
        }
    }
}
