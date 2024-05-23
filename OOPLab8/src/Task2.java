import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public static void FileReader() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть шлях до файлу: ");
        String puth = scanner.nextLine();

        File file = new File(puth);

        FileReader reader = new FileReader(puth);
        char[] rdata = new char[100];
        reader.read(rdata);

        for (char i : rdata){
            if(i == '\u0000') break;
            System.out.print(i);
        }
        System.out.println();

        reader.close();
    }
}
