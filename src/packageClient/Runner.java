package packageClient;

import java.io.*;
import java.net.Socket;

/**
 * Created by dsk15 on 10/12/2018.
 */
public class Runner {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("172.30.108.25",300);
           // OutputStream inputStream = new FileOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
