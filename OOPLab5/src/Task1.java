public class Task1 {
    private double a = 0, b = 0, h = 0;

    //variable a
    public void setA(double A){
        this.a = A;
    }
    public double getA(){
        return a;
    }

    //variable b
    public void setB(double B){
        this.b = B;
    }
    public double getB(){
        return b;
    }

    //variable height
    public void setH(double H){
        this.h = H;
    }
    public double getH(){
        return h;
    }

    Task1(double a, double b, double height) {
        setA(a);
        this.a = getA();

        setB(b);
        this.b = getB();

        setH(height);
        this.h = getH();
    }

    double area() {return ((this.a + this.b) / 2) * h;}
}
