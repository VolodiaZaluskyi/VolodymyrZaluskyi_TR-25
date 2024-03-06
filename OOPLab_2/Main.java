public class Main {
    public static void main(String[] args) {
            Task1 task1 = new Task1();
            Task2 task2 =  new Task2();
            Task3 task3 =  new Task3();
            Task4 task4 =  new Task4();
            Task5 task5 =  new Task5();

            task1.outPhrase_for("Hello!");
            task1.outPhrase_while("Hello");
            task2.outInfo_for();
            task3.outInfo_while();
            task4.outInfo_for();
            task5.Fx(0, 20);
    }
}