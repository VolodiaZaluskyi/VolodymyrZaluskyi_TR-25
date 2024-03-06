public class Task1 {

    public void outPhrase_for(String phrase){

        //task 1
        System.out.println("For:");
        for(int i = 0; i < 50; i++)
            System.out.println(phrase);
    }

    public  void outPhrase_while(String phrase){
        System.out.println("\nWhile:");
        int i = 0;
        while(i < 50){
            System.out.println(phrase);
            i++;
        }
    }
}
