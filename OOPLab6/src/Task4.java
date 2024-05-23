abstract class Car{
    String model;
    String color;
    double maxSpeed;

    public void gas(){
        System.out.println("Гузуємо!");
    }

    abstract void brake();
}

class Sedan extends Car {
    @Override
    public void gas(){
        System.out.println("Газуємо на седані!");
    }

    @Override
    public void brake(){
        System.out.println("Зупиняємось!");
    }
}

class Truck extends Car {
    @Override
    public void gas(){
        System.out.println("Газуємо на грузовику!");
    }

    @Override
    public void brake(){
        System.out.println("Тормозимо!");
    }
}