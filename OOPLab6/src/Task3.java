class Shape{
    double volume;
    public double getVolume(){
        return volume;
    }
}

class Pyramid extends Shape {
    double s, h;
}

class SolidofRevolution extends Shape {
    double radius;

    public double getRadius(){
        return 0;
    }
}

class Cylinder extends SolidofRevolution {
    double height;
}

class Ball extends SolidofRevolution {
}

