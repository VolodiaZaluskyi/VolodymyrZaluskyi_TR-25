public class Task5 {
    private int a;
    private int b;
    private double step;

    public void setA(int a){this.a = a;}
    public int getA() {return a;}

    public void setB(int b){this.b = b;}
    public int getB() {return this.b;}

    public void setStep(double step){this.step = step;}
    public double getStep() {return this.step;}

    public Task5(int a, int b, double step){
        setA(a);
        this.a = getA();

        setB(b);
        this.b = getB();

        setStep(step);
        this.step = getStep();
    }

    public int OutputFor(){
        double fx;
        int count = 0;
        for(double x = this.a; x < this.b; fx += this.step){
            fx = (2*x*Math.sin(x))-Math.cos(x);
            System.out.println(fx);
            x += step;
            count++;
        }
        return count;
    }

    public int OutputWhile(){
        double x = this.a;
        double fx = 0;
        int count = 0;
        while (x < b){
            fx = (2*x*Math.sin(x))-Math.cos(x);
            System.out.println(fx);
            x = x + step;
            count++;
        }

        return count;
    }
}
