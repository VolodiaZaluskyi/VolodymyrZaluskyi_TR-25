
class Person{
    String fullName;
    int age;

    public Person(){

    }

    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public void move(){}

    public void talk(){
        System.out.println("Говорить " + fullName);
    }
}




