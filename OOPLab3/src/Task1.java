public class Task1 {

    private String phrase; //приватне поле phrase
    private int num_repeat; //приватне поле num_repeat


    //Використовуємо гетер та сетер для безпечної ініціалізації полів phrase, num_repeat ///
    public void setPhrase(String x) {
        this.phrase = x;
    }

    public String getPhrase() {
        return phrase;
    }


    public void setNum_repeat(int x) {
        this.num_repeat = x;
    }

    public int getNum_repeat() {
        return num_repeat;
    }
    ///


    //Конструктор класу Task1
    public Task1(String phrase, int num_repeat){
        setPhrase(phrase);
        this.phrase = getPhrase();
        setNum_repeat(num_repeat);
        this.num_repeat = getNum_repeat();
    }

    //Метод OutputFor який за допомогою двох циклу for виводить фразу 'i' разів
    public void OutputFor(){
        for(int i = 0; i < this.num_repeat; i++){
            System.out.println(this.phrase);
        }
    }

    //Метод OutputFor який за допомогою двох циклу while виводить фразу 'i' разів
    public void OutputWhile(){
        int i = 0;
        while(i < this.num_repeat){
            System.out.println(this.phrase);
            i++;
        }
    }

}
