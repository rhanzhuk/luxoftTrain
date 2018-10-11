package iOStack;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileAnalyzer {

    public String convertContentToString(String path, String word) throws IOException {
        try (InputStream inputStream = new FileInputStream(path)) {

            StringBuilder content = new StringBuilder();
            byte[] buffer = new byte[1024];
            int count;
            while ((count = inputStream.read(buffer)) != -1) {
                content.append(new String(buffer, 0, count));
            }
            return content.toString();
        }
    }

    private List<String> unbuild(String content){
        List<String> stringList = new ArrayList<>();
        //TODO доделать этот метод!!!
        return stringList;
    }
}
