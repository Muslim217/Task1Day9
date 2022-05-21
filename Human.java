package Lessons;

public class Human {
    private String name;

    public String getName() { return name; }


    public Human(String name) { this.name = name; }

    void printInfo(){
        System.out.printf("Этот человек с именем %s" , name );
    }
}
