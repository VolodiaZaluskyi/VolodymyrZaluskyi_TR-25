import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


public class Task1 {
    public static void FileCheck() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть шлях до файлу: ");
        String puth = scanner.nextLine();

        File file = new File(puth);
        if(file.exists()) System.out.println("Файл знайдено!");
        else System.out.println("Файл створено!");

        System.out.println("\nДіапазон випадкових чисел");
        FileWriter writer = new FileWriter(file);
        System.out.print("Введіть початкову границю: ");
        int b1 = scanner.nextInt();
        System.out.print("\nВведіть кінцеву границю: ");
        int b2 = scanner.nextInt();


        Random rand = new Random();
        for(int i = 0; i < b2; i++) {
            if(file.exists()) writer.append((String) (rand.nextInt(b2 - b1 + 1) + b1 + " "));
            else writer.write((String) (rand.nextInt(b2 - b1 + 1) + b1 + " "));
        }
        writer.close();
    }
}
