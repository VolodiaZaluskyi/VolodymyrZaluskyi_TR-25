public class Main {
    public static void main(String[] args) {

        //task 1
        System.out.println("Task 1");
        int number1 = 1941;
        int number2 = 1;
        int number3 = 1;
        int number4 = 1;
        int number5 = 1;
        int number6 = 1;
        int number7 = 1;
        int number8 = 1;
        int number9 = 1;
        int number10 = 1;

        int summ = number1 + number2 + number3 + number4 + number5 + number6 + number7 + number8 + number9 + number10;
        int subtracting = number1 - number2 - number3 - number4 - number5 - number6 - number7 - number8 - number9 - number10;
        int multiply =  number1 * number2 * number3 * number4 * number5 * number6 * number7 * number8 * number9 * number10;
        int deviding =  number1 / number2 / number3 / number4 / number5 / number6 / number7 / number8 / number9 / number10;

        System.out.println("Додавання - " + summ + "\n" + "Віднімання - " + subtracting + "\n" + "Множення - " + multiply + "\n" + "Ділення - " + deviding + "\n");


        //task 2
        System.out.println("Task 2");
        String sentense = "Любов ";
        sentense += "зігріває ";
        sentense += "душу ";
        sentense += "і ";
        sentense += "робить ";
        sentense += "наше ";
        sentense += "життя ";
        sentense += "багатшим ";
        sentense += "і ";
        sentense += "щасливішим ";

        System.out.println(sentense);

        //task 3
        System.out.println("\nTask 3");
        User user1 = new User(1, 45, 84, 189);
        User user2 = new User(2, 23, 65, 175);
        User user3 = new User(3, 12, 36, 139);
        User user4 = new User(4, 18, 60, 170);
        User user5 = new User(5, 56, 106, 172);
        User user6 = new User(6, 10, 24, 130);
        User user7 = new User(7, 25, 78, 180);
        User user8 = new User(8, 9, 50, 140);
        User user9 = new User(9, 19, 55, 160);
        User user10 = new User(10, 22, 72, 172);

        int summ_age = user1.age + user2.age + user3.age + user4.age + user5.age + user6.age + user7.age + user8.age + user9.age + user10.age;
        double summ_weight = user1.weight + user2.weight + user3.weight + user4.weight + user5.weight + user6.weight + user7.weight + user8.weight + user9.weight + user10.weight;
        double summ_height = user1.height + user2.height + user3.height + user4.height + user5.height + user6.height + user7.height + user8.height + user9.height + user10.height;

        System.out.println(summ_age);
        System.out.println(summ_weight);
        System.out.println(summ_height);


        //task 4
        System.out.println("\nTask 4");
        Car car1 = new Car(200, 3, 2008, "green", "BMW", 10000);
        Car car2 = new Car(250, 4, 2018, "white", "Volvo", 5000);
        Car car3 = new Car(260, 4.2, 2003, "red", "Wolkswagen", 6799);
        Car car4 = new Car(600, 5, 1992, "white", "Lada", 500);
        Car car5 = new Car(230, 9, 2000, "black", "Mutsubisi", 8900);
        Car car6 = new Car(260, 2, 2001, "blue", "Audi", 5500);
        Car car7 = new Car(275, 3, 1999, "white", "Chevrolet", 7300);
        Car car8 = new Car(235, 4, 2019, "orange", "Toyota", 4300);
        Car car9 = new Car(205, 1, 2012, "white", "Audi", 2800);
        Car car10 = new Car(215, 2, 1990, "black-blue-red", "Lada", 300);

        System.out.println(car1.capacity + car2.capacity + car3.capacity + car4.capacity + car5.capacity + car6.capacity + car7.capacity + car8.capacity + car9.capacity + car10.capacity);
        System.out.println(car1.power + car2.power + car3.power + car4.power + car5.power + car6.power + car7.power + car8.power + car9.power + car10.power);

        //task 5
        System.out.println("\nTask 5");

        int number = 392;
        int reversedNumber = 0;


        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println(reversedNumber);
    }
}

//addition for task 3
class User{
    int id;
    int age;
    String name;
    String surname;
    double weight;
    double height;

    public User(int id, int age, double weight, double height){
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
}

//addition for task 4
class Car{
    double power;
    double capacity;
    int release;
    String color;
    String brand;
    double price;

    public Car(double power, double capacity, int release, String color, String brand, double price){
        this.power = power;
        this.capacity = capacity;
        this.release = release;
        this.color = color;
        this.brand = brand;
        this.price = price;
    }
}