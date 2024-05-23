public class Task4 {
    private int hour;
    private int min;
    private int sec;
    private String cycle_type;


    //Getter and Setter Hour
    public void setHour(int x){
        if(x >= 0 && x <= 24) this.hour=x;
    }
    public int getHour(){
        return hour;
    }

    //Getter and Setter Minutes
    public void setMin(int x){
        if(x >= 0 && x <= 60) this.min=x;
    }
    public int getMin(){
        return min;
    }

    //Getter and Setter Seconds
    public void setSec(int x){
        if(x >= 0 && x <= 60) this.sec=x;
    }
    public int getSec(){
        return sec;
    }

    public Task4(int hour, int min, int sec){

        setHour(hour);
        setMin(min);
        this.hour = getHour();
        this.min = getMin();
        setSec(sec);
        this.sec = getSec();
    }

    public void OutputFor(){
        for(int i = 0; i <= hour; i++){
            for(int j = 0; j <= min; j++){
                for (int k = 0; k <= sec; k++) System.out.println(i + " h " + j + " min " + k);
            }
        }
    }
}
