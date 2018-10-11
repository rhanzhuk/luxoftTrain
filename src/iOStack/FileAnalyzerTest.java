package iOStack;

import java.io.IOException;

public class FileAnalyzerTest {
    public static void main(String[] args) {
        String path = "P:\\testDir\\text1.txt";

        FileAnalyzer fileAnalyzer = new FileAnalyzer();
        try {
            System.out.println(fileAnalyzer.convertContentToString(path, "a"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
