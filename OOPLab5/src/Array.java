import java.util.Scanner;

public class Array {

    public static int[] makeArray(){

        System.out.print("Введіть кількість елементів масиву: ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] array = new int[count];
        System.out.println("Введіть послідовно елементи масиву");

        for(int i = 0; i < array.length; i++){
            System.out.print("int[" + i + "/" + (array.length-1) +"]: ");
            array[i] = scanner.nextInt();
        }

        return array;
    }
}