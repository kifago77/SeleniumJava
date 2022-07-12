package CreateFiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FilesTest {
    public static void main(String[] args) throws IOException {
        File file = new File("plik.txt");
        if(file.createNewFile()){
            System.out.println("New file");
        }else {
            System.out.println("File is already exist");
        }

    }
}
