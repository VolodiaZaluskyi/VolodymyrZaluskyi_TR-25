class Phone{
    long number;
    String model;
    int weight;

    public Phone(long number, String model, int weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(long number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone(){
    }

    public void receiveCall(String caller){
        System.out.println("Дзвонить, " + caller + ".");
    }


    public void receiveCall(String caller, long number){
    }

    public long getNumber(){
        return number;
    }

    public void sendMessage(long[] number){
        for(int i = 0; i < number.length; i++){
            System.out.println(number[i]);
        }
    }
}

