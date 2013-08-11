package tk.zeryter.launcher;

public class LauncherMain {

    static String userHome = System.getProperty("user.home");

    static FileDL filedl;

    public static void main(String[] args){

        filedl = new FileDL();

        filedl.downloadFile("http://zeryter.tk/minecraft_servers/minecraft_snapshot.jar",userHome + "/.");


    }

}
