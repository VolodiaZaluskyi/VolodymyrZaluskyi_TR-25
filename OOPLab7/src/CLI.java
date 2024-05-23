import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CLI {
    private static void info(){
        System.out.println("Task 1 (1)");
        System.out.println("Task 2 (2)");
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
                    ArrayList<Car> carPark = new ArrayList<Car>();

                    Driver driver1 = new Driver("Petro", 35, 3);
                    Car car1 = new Car("BMW", 3,driver1, 20000, 2008);
                    carPark.add(car1);

                    Driver driver2 = new Driver("Sergey", 52, 23);
                    Car car2 = new Car("Volvo", 2, driver2, 25000, 2022);
                    carPark.add(car1);

                    Driver driver3 = new Driver("Dmitro", 25, 3.5);
                    Car car3 = new Car("Wolkswagen", 2, driver3, 5000, 2015);
                    carPark.add(car1);

                    Driver driver4 = new Driver("Andrew", 29, 5);
                    Car car4 = new Car("Lada", 1, driver4, 500, 1994);
                    carPark.add(car1);

                    Driver driver5 = new Driver("Viktor", 41, 11);
                    Car car5 = new Car("BMW", 2, driver5, 900, 2015);
                    carPark.add(car5);

                    Driver driver6 = new Driver("Olga", 35, 10);
                    Car car6 = new Car("Toyota", 3, driver6, 700, 2008);
                    carPark.add(car6);

                    Driver driver7 = new Driver("Viktor", 40, 15);
                    Car car7 = new Car("BMW", 2, driver7, 900, 2015);
                    carPark.add(car7);

                    Driver driver8 = new Driver("Maria", 28, 3);
                    Car car8 = new Car("Audi", 4, driver8, 600, 2019);
                    carPark.add(car8);

                    Driver driver9 = new Driver("Ivan", 45, 20);
                    Car car9 = new Car("Mercedes", 5, driver9, 1000, 2017);
                    carPark.add(car9);

                    Driver driver10 = new Driver("Olena", 30, 8);
                    Car car10 = new Car("Ford", 2, driver10, 800, 2013);
                    carPark.add(car10);

                    Driver driver11 = new Driver("Petro", 33, 12);
                    Car car11 = new Car("Chevrolet", 4, driver11, 650, 2016);
                    carPark.add(car11);

                    Driver driver12 = new Driver("Natalia", 38, 18);
                    Car car12 = new Car("Honda", 3, driver12, 720, 2014);
                    carPark.add(car12);

                    Driver driver13 = new Driver("Dmytro", 31, 9);
                    Car car13 = new Car("Subaru", 2, driver13, 750, 2012);
                    carPark.add(car13);

                    Driver driver14 = new Driver("Yulia", 42, 22);
                    Car car14 = new Car("Mazda", 5, driver14, 680, 2018);
                    carPark.add(car14);


                    car1.fixEngine();
                    car1.applyDriver(driver2);

                    car2.fixEngine();
                    car2.applyDriver(driver3);

                    car3.fixEngine();
                    car3.applyDriver(driver4);

                    car4.fixEngine();
                    car4.applyDriver(driver5);

                    car5.fixEngine();
                    car5.applyDriver(driver6);

                    car6.fixEngine();
                    car6.applyDriver(driver7);

                    car7.fixEngine();
                    car7.applyDriver(driver8);

                    car8.fixEngine();
                    car8.applyDriver(driver9);

                    car9.fixEngine();
                    car9.applyDriver(driver10);

                    car10.fixEngine();
                    car10.applyDriver(driver11);

                    car11.fixEngine();
                    car11.applyDriver(driver12);

                    car12.fixEngine();
                    car12.applyDriver(driver13);

                    car13.fixEngine();
                    car13.applyDriver(driver14);

                    car14.fixEngine();
                    car14.applyDriver(driver1);


                    for(int i = 0; i < carPark.size(); i += 2){
                        carPark.get(i).fixEngine();
                        carPark.get(i).priceUp();
                    }

                    for (int i = 0; i < carPark.size(); i++){
                        if(carPark.get(i).driver.experience < 5 && carPark.get(i).driver.age > 25){
                            carPark.get(i).driver.qualificationUp();
                        }
                    }

                    Helper helper = new Helper();
                    helper.driverHere(helper.selectCar(carPark));
                    break;

                case "2":
                    //put (K key, V value) - додає елемент в карту
                    PhoneBook phoneBook = new PhoneBook();
                    phoneBook.phone = new HashMap<>();
                    phoneBook.phone.put("Nazar", 380965386100L);
                    phoneBook.phone.put("Ivanov", 380965386101L);
                    phoneBook.phone.put("Petrov", 380965386102L);
                    phoneBook.phone.put("Sidorov", 380965386103L);
                    phoneBook.phone.put("Smith", 380965386104L);
                    phoneBook.phone.put("Johnson", 380965386105L);
                    phoneBook.phone.put("Brown", 380965386106L);
                    phoneBook.phone.put("Lee", 380965386107L);
                    phoneBook.phone.put("Kim", 380965386108L);
                    phoneBook.phone.put("Chen", 380965386109L);

                    //get (Object key)  - шукає значення по його ключу
                    Scanner scanner = new Scanner(System.in);

                    System.out.println(phoneBook.phone.get("Lee"));

                    //remove (Object key)  - видаляє значення по його ключу
                    phoneBook.phone.remove("Kim");

                    //containsKey (Object key)  - запитує, чи є в карті заданий ключ
                    System.out.println(phoneBook.phone.containsKey("Kim"));

                    //containsValue (Object value)  - запитує чи є в карті задане значення
                    System.out.println(phoneBook.phone.containsValue(380965386103L));

                    //size () - повертає розмір карти (кількість пар "ключ-значення")
                    System.out.println(phoneBook.phone.size());

                    //Добавив у книгу не менше 10 прізвищ та номерів телефонів.
                    phoneBook.phone.put("Kim", 380965386108L);

                    //Виведіть, використовуючи цикл, інформацію з книги.
                    for (String i : phoneBook.phone.keySet()) {
                        System.out.println("Прізвище: " + i + "; Номер: " + phoneBook.phone.get(i));
                    }

                    //Знайшов заданий номер у книзі за прізвищем.
                    boolean cValue = false;
                    cValue = phoneBook.phone.containsValue(380965386796L);

                    // У разі відсутності прізвища – на екран має бути виведено повідомлення «У книзі відсутній такий абонент».
                    if(cValue != true){
                        System.out.println("У книзі відсутній такий абонент");
                    }

                    // Видаліть довільний запис з книги. Виведіть кількість записів у книзі.
                    phoneBook.phone.remove("Lee");
                    System.out.println(phoneBook.phone.size());
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
