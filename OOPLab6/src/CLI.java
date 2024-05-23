import java.util.Scanner;

public class CLI {
        private static void info(){
            System.out.println("Task 1 (1)");
            System.out.println("Task 2 (2)");
            System.out.println("Task 3 (3)");
            System.out.println("Task 4 (4)");
            System.out.println("Task 5 (5)");
            System.out.println("Task 6 (6)");
            System.out.println("Info (info)");
            System.out.println("Exit (exit)");
        }

        public static void run(){

            CLI.info();
            while(true){
                Scanner keyboard = new Scanner(System.in);
                System.out.print("Input:> ");
                String input = keyboard.nextLine();

                switch (input){
                    case "1":
                        Person person1 = new Person();
                        person1.talk();

                        System.out.print("Введіть повне ім'я: ");
                        Scanner scanner = new Scanner(System.in);
                        String f_name = scanner.nextLine();

                        Person person2 = new Person(f_name, 18);
                        person2.talk();
                        break;

                    case "2":
                        Phone obj1 = new Phone(380685869346L, "apple", 198);
                        Phone obj2 = new Phone(380983683769L, "alcatel", 150);
                        Phone obj3 = new Phone(380967207839L, "xiaomi", 189);

                        System.out.println("Number: " + obj1.number);
                        System.out.println("Model: " + obj1.model);
                        System.out.println("Weight: " + obj1.weight);
                        System.out.println("\n");

                        System.out.println("Number: " + obj2.number);
                        System.out.println("Model: " + obj2.model);
                        System.out.println("Weight: " + obj2.weight);
                        System.out.println("\n");

                        System.out.println("Number: " + obj3.number);
                        System.out.println("Model: " + obj3.model);
                        System.out.println("Weight: " + obj3.weight);

                        obj1.receiveCall("Дмитро");
                        System.out.println("\n");

                        Phone sender = new Phone();
                        long[] numbers = {380967207839L, 380983683769L, 380685869346L};
                        sender.sendMessage(numbers);
                        break;


                    case "3":
                        System.out.println("Shape -> Pyramid, SolidofRevolution");
                        System.out.println("SolidofRevolution -> Cylinder, Ball");
                        break;

                    case "4":
                        Sedan car1 = new Sedan();
                        Truck car2 = new Truck();

                        car1.gas();
                        car1.brake();

                        car2.gas();
                        car2.brake();
                        break;

                    case "5":
                        LibCard person = new LibCard();
                        person.name = "Володимир";
                        person.surname = "Залуський";
                        person.numberBook = 10;

                        person.getName();
                        person.getSurname();
                        person.getNumberBook();
                        person.increaseBook(3);
                        person.ReduceBook(2);
                        break;

                    case "6":
                        Student student = new Student();
                        student.name = "Дарина";
                        student.surname = "Головко";
                        student.numberBook = 25;
                        student.group = "ТР-25";
                        student.institute = "ІТРЕ";
                        student.getName();
                        student.getSurname();
                        student.getGroup();
                        student.getInstitute();
                        student.getNumberBook();
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
