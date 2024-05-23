public class Main {
    public static void main(String[] args) {

        //Task 1
        //Створити пустий масив та :
        //•	Заповнити його 50 парними та непарними числами.
        System.out.println("Task 1");
        Task1.do50EventOddNumbers();

        //Task2
        System.out.println();
        System.out.println("Task 2");
        Task2 task2 = new Task2();

        //Зробити масив з 10 чисел [2,17,13,6,22,31,45,66,100,-18] та:
        //•	перебрати його циклом while
        System.out.println();
        task2.doTask21();

        //•	перебрати його циклом for
        System.out.println();
        task2.doTask22();

        //•	перебрати циклом while та вивести  числа тільки з непарним індексом
        System.out.println();
        task2.doTask23();

        //•	перебрати циклом for та вивести  числа тільки з парним індексом
        System.out.println();
        task2.doTask24();

        //•	вивести масив в зворотньому порядку.
        System.out.println();
        task2.doTask25();


        //Task3
        //Обчислити в одновимірному масиві, що складається з n дійсних елементів, суму елементів масиву.
        System.out.println();
        System.out.println("Task 3");
        System.out.print("Сума елементів масиву: ");
        double[] numbers = {2,17,13,6,22,31,45,66,100,-18};
        Task3.doTask3(numbers);


        //Task4
        //Змінити знак всіх непарних елементів масиву.
        System.out.println();
        System.out.println("Task 4");
        System.out.println("Змінити знак всіх непарних елементів масиву.");
        double[] array = {3,5,6,8,9,0};
        Task4.doTask4(array);
    }
}