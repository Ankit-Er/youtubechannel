package encapsulation;

import java.util.Scanner;

public class Test {

    //Encapsulation With Abstraction
    public static void main(String[] args) {

        System.out.println("**** Welcome *****");

        System.out.println("If you want to see your details (Press 1)");
        int opt = new Scanner(System.in).nextInt();

        System.out.println("Please enter your roll no :");
        int rollNo = new Scanner(System.in).nextInt();

        SeviceLayer sl = new SeviceLayer();
        Student stu = sl.getStudent(rollNo);

        if(stu!=null) {
            System.out.println("Student Name : " + stu.getName());
            System.out.println("Student RollNo : " + stu.getRollNo());
        }
        else {
            System.out.println("Invalid your roll no!!");
        }


    }
}
