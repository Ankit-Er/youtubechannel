package encapsulation;

import java.util.*;

public class DAO {

    List<Student> getStudents(){

        Student stu1 = new Student();
        stu1.setName("Rohan");
        stu1.setRollNo(1234);


        Student stu2 = new Student();
        stu2.setName("Riya");
        stu2.setRollNo(7894);

        return Arrays.asList(stu1,stu2);
    }
}
