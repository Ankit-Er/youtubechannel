package treeset;

//imagine that class is implemented in different project...
public class MyStudent{

    private String name;
    private int rollNo;

    public MyStudent(String name, int rollNo) {
        super();
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }


    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNo=" + rollNo + "]";
    }

}
