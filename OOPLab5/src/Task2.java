public class Task2 {
    public static void minNumber(int x1, int x2, int x3) {
        int[] number = {x1, x2, x3};

        int temp = x1;

        for (int i: number){
            if(temp > i) temp = i;
        }

        System.out.println("Найменше число: " + temp);
    }
}
