public class Task3 {
    public void outInfo_while(){
        System.out.println("\nTask 3:");
        System.out.println("While:");
        int i = 0;
        int j;

        while(i <= 2){
            j = 0;
            while (j < 60){
                System.out.println(i + " h " + j + "min");
                j++;
            }
            i++;
        }
    }
}
