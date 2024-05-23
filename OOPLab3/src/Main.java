import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Екземпляр класу Scanner з атрибутом для вводу даних
        Scanner input = new Scanner(System.in);


        //Завдання 1
        System.out.print("Введіть фразу: "); //Вивід
        String phrase = input.nextLine(); //Зчитування з консолі лінійки і запис його в змінну phrase
        Task1 task1 = new Task1(phrase, 50); //За допомогою конструктора ініціалізуємо атрибути класу Task1

        System.out.println("Task 1. For:");
        task1.OutputFor();  //Звертаємось до обєкта task1 і викликаємо метод ShowFor
        //Який виконає 50 разів вивід нашої встановленої фрази за допомогою циклу for

        System.out.println("\nTask 1. While:");
        task1.OutputWhile(); //Звертаємось до обєкта task1 і викликаємо метод ShowFor
        //Який виконає 50 разів вивід нашої встановленої фрази за допомогою циклу while
        task1 = null; //Присвоюємо класу task1 значення null щоб відвязати його від силок в кучі
        System.gc(); //Викликаємо збиральник сміття, щоб він зміг оприділити та видалити наш клас з пам'яті

        //task 2
        System.out.println("\nTask 2. For:");
        System.out.print("Введіть годину: "); //2 години
        int hour = input.nextInt();
        System.out.print("Введіть хвилину: "); //59 хвилин
        int min = input.nextInt();

        Task2 task2 = new Task2(hour, min); //Ініціалізуємо екземпляр класу атрибутами час = 2, хвилини = 60
        task2.OutputFor();    //Викликаємо метод OutputFor який почне відлік
        // від 0 годин та 0 хвилин і закінчить 2 годиною 59 хвилиною за допомогою циклу for
        task2 = null;
        System.gc();

        //task 3
        System.out.println("\nTask 3. While:");
        Task3 task3 = new Task3(hour, min); //Ініціалізуємо екземпляр класу атрибутами час = 2, хвилини = 60
        task3.OutputWhile();  //Викликаємо метод OutputFor який почне відлік
        // від 0 годин та 0 хвилин і закінчить 2 годиною 59 хвилиною за допомогою циклу for
        task3 = null;
        System.gc();

        //task 4
        System.out.println("\nTask 4. While:");
        System.out.print("Введіть годину: "); //2 години
        hour = input.nextInt();
        System.out.print("Введіть хвилину: "); //59 хвилини
        min = input.nextInt();
        System.out.print("Введіть секунду: "); //59 секунди
        int sec = input.nextInt();

        Task4 task4 = new Task4(hour, min, sec); //Ініціалізуємо екземпляр класу атрибутами
        task4.OutputFor(); //Викликаємо метод OutputFor який почне відлік
        // від 0 годин, 0 хвилин, 0 секунд і закінчить 2 годиною, 59 хвилиною, 59 секундою за допомогою циклу for
        task4 = null;
        System.gc();

        //task 5
        System.out.println("\nTask 5:");

        System.out.print("Введіть крок: ");
        double step = input.nextDouble(); //Записуємо введенні дані з консолі в змінну step

        System.out.print("Введіть початкову границю: ");
        int a = input.nextInt(); //Записуємо введенні дані з консолі в змінну a

        System.out.print("Введіть кінцеву границю: ");
        int b = input.nextInt(); //Записуємо введенні дані з консолі в змінну b

        //for
        System.out.println("\nFor:");
        Task5 task5 = new Task5(a, b, step); //ініціалізуємо екземпляр
        int count1 = task5.OutputFor(); //Викликаємо функцію OutputFor та поміщаємо кількість кроків в змінну count1

        System.out.println("Кількість значень функції f(x) = 2x*sin(x) - cos(x) на проміжку від -2 до 2: " + count1);

        //while
        System.out.println("\nWhile:");
        int count2 = task5.OutputWhile(); //Викликаємо функцію OutputWhile та поміщаємо кількість кроків в змінну count2
        task5 = null;
        System.gc();

        System.out.println("Кількість значень функції f(x) = 2x*sin(x) - cos(x) на проміжку від -2 до 2: " + count2);
    }
}