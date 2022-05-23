package Lessons.Day8Task2;

public abstract class Figure {
    private String colour;

    public abstract double area();

    public abstract double perimeter();

    public Figure(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
}






