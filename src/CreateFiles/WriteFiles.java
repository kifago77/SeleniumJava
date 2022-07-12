package CreateFiles;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {
    public static void main(String[] args) throws IOException {
        FileWriter read = new FileWriter("plik.txt");
        read.write("Nowy tekst po zmianie");
        read.close();

    }
}
