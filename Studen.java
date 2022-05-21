package Lessons;

public class Studen extends Human{

    private String groupName;

    public String getGroupName() {
        return groupName;
    }

    public Studen(String name, String groupName) {
        super(name);
    }

    @Override
    void printInfo () {
        super.printInfo();
        System.out.printf(" Этот cтудент с именем %s", getName());
    }
}
