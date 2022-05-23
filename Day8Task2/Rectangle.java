package Lessons.Day8Task2;

public class Rectangle extends Figure {
    private int shortR;
    private int lenghtR;


    public Rectangle(String colour,int shortR, int lenghtR) {
        super(colour);
        this.shortR = shortR;
        this.lenghtR = lenghtR;
    }

    @Override
    public double area () {
       double s = shortR * lenghtR;
        return s;
    }

    @Override
    public double perimeter() {
        int p = shortR + shortR + lenghtR + lenghtR;
        return p ;
    }
}
