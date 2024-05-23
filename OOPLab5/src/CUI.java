import java.util.Scanner;

public class CUI{


    private static void info(){
        System.out.println("Options:");
        System.out.println("Task 1 (1)");
        System.out.println("Task 2 (2)");
        System.out.println("Task 3 (3)");
        System.out.println("Task 4 (4)");
        System.out.println("Info (?)");
        System.out.println("Exit (exit)\n");
    }

    public static void run(){

        CUI.info();
        while(true){
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Input:> ");
            String input = keyboard.nextLine();

            try {
                switch (input) {
                    case "1":
                        System.out.print("Введіть сторону а: ");
                        int a = keyboard.nextInt();

                        System.out.print("Введіть сторону b: ");
                        int b = keyboard.nextInt();
                        System.out.print("Введіть висоту трапеції: ");
                        int height = keyboard.nextInt();

                        Task1 obj1 = new Task1(a, b, height);
                        System.out.println("Площа трапеції: " + obj1.area());
                        break;

                    case "2":
                        System.out.print("Введіть число 1: ");
                        int number1 = keyboard.nextInt();

                        System.out.print("Введіть число 2: ");
                        int number2 = keyboard.nextInt();

                        System.out.print("Введіть число 3: ");
                        int number3 = keyboard.nextInt();
                        Task2.minNumber(number1, number2, number3);
                        break;


                    case "3":
                        Task3.showArray();
                        break;

                    case "4":
                        int max = Task4.maxArrNumber();
                        System.out.println("\nМаксимальне число в масиві: " + max);
                        break;

                    case "?":
                        CUI.info();
                        break;

                    case "exit":
                        System.exit(0);
                        break;

                    default:
                        System.out.println("\"" + input + "\" is not recognized");
                        break;
                }
            } catch (Exception ex){
                System.out.println("NotValidInput");
            }
            System.out.println();
        }
    }


}
