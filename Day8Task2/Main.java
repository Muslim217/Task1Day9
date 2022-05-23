package Lessons.Day8Task2;

public class Main {
    public static void main(String[] args) {
        Figure figures[] ={new Triangle("Red", 10, 10,10 ),
                new Triangle("Green", 20, 30, 10),
                new Triangle("Red", 20, 15, 10),
                new Rectangle("Red", 10, 5),
                new Rectangle("Orange", 15,40 ),
                new Circle("Red", 4),
                new Circle("Red", 10),
                new Circle("Blue", 5)};
        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));




    }




    public static double calculateRedPerimeter(Figure[] figures){
        double sumPer=0;
       for (int i = 0; i < figures.length; i++){
          switch (figures[i].getColour()){
           case "Red": sumPer = sumPer+figures[i].perimeter();

           break;
          }
       }
        return sumPer;
    }
    public static double calculateRedArea(Figure[] figures){
        double sumAr=0;
        for (int i = 0; i < figures.length; i++){
            switch (figures[i].getColour()){
                case "Red": sumAr =sumAr+figures[i].area();break;
            }
        }
        return sumAr;
    }
}
