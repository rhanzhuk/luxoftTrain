package iOStack;

import java.io.File;
import java.io.IOException;

public class TestFileManager {

    public static void main(String[] args) {
        String string = "P:\\testDir";

        try {
            System.out.println(FileManager.countDirs(string));
            System.out.println(FileManager.countFiles(string));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
