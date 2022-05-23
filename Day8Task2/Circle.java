package Lessons.Day8Task2;

public class Circle extends Figure {
    private int r0 ;


    public Circle(String colour, int r0) {
        super(colour);
        this.r0 = r0;
    }
    public double area(){
        double s = Math.PI * Math.pow(r0,2);
        return s;

    }
    public double perimeter(){
        double p = 2 * Math.PI * r0;
        return p;
    }
}
