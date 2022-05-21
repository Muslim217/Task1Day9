package Lessons;

public class Teacher extends Human{
    String subjectName;

    public String getSubjectName(){
        return subjectName;
    }

    public Teacher(String name, String subjectName) {
        super(name);
        this.subjectName = subjectName;
    }
    void printInfo (){
        super.printInfo();
        System.out.printf(" Это преводаватель с именем %s",getName());

    }
}
