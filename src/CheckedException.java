import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
    public static void main(String[] args)  {
        try {
            System.out.println("Before reading files");
            readFiles("D:\\SeleniumJava\\src\\plik.txt");
            System.out.println("Closing files");
        } catch (FileNotFoundException e) {
            System.out.println("Wyjątek został Wyrzucony");
            System.out.println(e.getMessage());
        }
    }




    public static void readFiles(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
    }
}
