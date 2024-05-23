public class Task2 {
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

    public Task2(int hour, int min){
        setHour(hour);
        setMin(min);
        this.hour = getHour();
        this.min = getMin();
    }

    public void OutputFor() {
        for(int i = 0; i <= this.hour; i++){
            for(int j = 0; j <= this.min; j++) System.out.println(i + " h " + j + "min");
        }
    }
}
