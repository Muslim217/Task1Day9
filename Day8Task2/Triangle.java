package Lessons.Day8Task2;

public class Triangle extends Figure{
    int side1;
    int side2;
    int side3;


    public Triangle(String colour, int side1, int side2, int side3) {
        super(colour);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {
        double s = (Math.pow(side1,2)*Math.sqrt(3))/4;
        return s ;
    }

    @Override
    public double perimeter() {
        double p = side1 + side2 + side3;
        return p;
    }
}
