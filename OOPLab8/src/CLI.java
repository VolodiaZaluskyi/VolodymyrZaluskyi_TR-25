import java.io.IOException;
import java.util.Scanner;

public class CLI {
    private static void info(){
        System.out.println("Task 1 (1)");
        System.out.println("Task 2 (2)");
        System.out.println("Info (info)");
        System.out.println("Exit (exit)");
    }

    public static void run() throws IOException {

        CLI.info();
        while(true){
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Input:> ");
            String input = keyboard.nextLine();

            switch (input){
                case "1":
                    Task1.FileCheck();
                    break;

                case "2":
                    Task2.FileReader();
                    break;

                case "info":
                    CLI.info();
                    break;

                case "exit":
                    System.exit(0);
                    break;

                default:
                    System.out.println("\""+ input + "\" is not recognized");
                    break;
            }
        }
    }
}