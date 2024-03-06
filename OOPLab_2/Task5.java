public class Task5 {
    public void Fx(int start_border, int end_border){
        //task 5
        System.out.println("\nTask 5:");

        double step = 0.2;
        int count = 0;

        //for
        System.out.println("\nFor:");
        for(double fx = start_border; fx < end_border; fx += step){
            System.out.println(fx);
            count++;
        }
        System.out.println("Кількість значень функції f(x) = 2x*sin(x) - cos(x) на проміжку від -2 до 2: " + count);



        //while
        System.out.println("\nWhile:");
        double fx;
        fx = start_border;
        count = 0;
        while (fx < end_border){
            System.out.println(fx);
            fx += step;
            count++;
        }
        System.out.println("Кількість значень функції f(x) = 2x*sin(x) - cos(x) на проміжку від -2 до 2: " + count);

    }
}
