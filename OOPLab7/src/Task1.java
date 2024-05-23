import java.util.*;

class Car{
    String brand;
    double power;
    Driver driver;
    double price;
    int release;

    public Car(){}
    public Car(String brand, double power, Driver driver, double price, int release){
        this.brand = brand;
        this.power = power;
        this.driver = driver;
        this.price = price;
        this.release = release;
    }

    public void fixEngine(){
        power = power + ((power * 10) / 100);
    }

    public void applyDriver(Driver driver){
        this.driver = driver;
    }

    public void priceUp(){
        this.price = price + ((price * 5) / 100);
    }
}

class Driver{
    String name;
    int age;
    double experience;

    public Driver(String name, int age, double experience){
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public void qualificationUp(){
        experience++;
    }
}

class Helper{
    public Car selectCar(ArrayList<Car> cars){
        Random rand = new Random();
        int index = rand.nextInt(cars.size());
        System.out.println("Автомобіль марки: " + cars.get(index).brand + " з водієм: " + cars.get(index).driver.name + " виїхав за вами.");

        return cars.get(index);
    }

    public void driverHere(Car car){
        System.out.println("Водій: " + car.driver.name + " прибув на місце.");
    }
}