class LibCard{
    String name, surname;
    int numberBook;

    public void getName(){
        System.out.println("Ім'я: "+ name);
    }

    public void getSurname(){
        System.out.println("Прізвище: " + surname);
    }

    public void getNumberBook(){
        System.out.println("Читач має: " + numberBook + " книг");
    }

    public void increaseBook(int unit){
        numberBook += unit;
        System.out.println("Кількість книг збільшилось на: " + unit);
    }

    public void ReduceBook(int unit) {
        numberBook -= unit;
        System.out.println("Кількість книг зменшилось на: " + unit);
    }
}