package iOStack;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// public static int countFiles(String path) - принимает путь к папке, возвращает количество файлов в папке и всех подпапках по пути
// public static int countDirs(String path) - принимает путь к папке, возвращает количество папок в папке и всех подпапках по пути
public class FileManager {

    //TODO переписать методы рекурсивно + тесты
    public static int countFiles(String path) throws IOException{
        File file = new File(path);
        int count = 0;
        if (file.isDirectory()){
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++){
                if(files[i].isFile()){
                    count++;
                }
            }
        }
        return count;
    }

    public static int countDirs(String path) throws  IOException{
        File file = new File(path);
        int count = 0;
        if (file.isDirectory()){
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++){
                if(files[i].isDirectory()){
                  count++;
                }
            }
        }
        return count;
    }
}
