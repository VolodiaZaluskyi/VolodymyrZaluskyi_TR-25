public class Task3 {

    private int hour;
    private int min;


    //Getter and Setter Hour
    public void setHour(int x){
        if(x >= 0) this.hour=x;
    }
    public int getHour(){
        return hour;
    }

    //Getter and Setter Minutes
    public void setMin(int x){
        if(x >= 0) this.min=x;
    }
    public int getMin(){
        return min;
    }


    public Task3(int hour, int min){
        setHour(hour);
        setMin(min);
        this.hour = getHour();
        this.min = getMin();
    }

    public void OutputWhile() {
        int k = 0;
        int z;

        while(k <= hour){
            z = 0;
            while (z <= min){
                System.out.println(k + " h " + z + "min");
                z++;
            }
            k++;
        }
    }
}
