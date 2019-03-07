package Problem2;

import com.jcraft.jsch.JSch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SendFile {


    public void sendFileToRemote() throws FileNotFoundException {
        String DIR = "/home/aibek/stazhirovka/file";

        JSch jSch = new JSch();

        FileInputStream is = new FileInputStream(DIR);

    }
}
