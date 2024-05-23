import java.util.Random;

public class Task1 {

    public static void do50EventOddNumbers(){
        System.out.println("50 even numbers:");

        Random random = new Random();

        int count = 0;
        int number;

        int[] numbers = new int[100];
        while (count < 50){
            number = random.nextInt(100);
            if((number % 2) == 0) {
                numbers[count] = number;
                System.out.println(numbers[count]);
                count++;
            } else{
                number++;
            }
        }

        System.out.println();
        System.out.println("50 odd numbers:");
        while (count < 100){
            number = random.nextInt(100);
            if((number % 2) == 1) {
                numbers[count] = number;
                System.out.println(numbers[count]);
                count++;
            } else{
                number++;
            }
        }
    }
}
