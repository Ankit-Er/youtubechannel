package encapsulation;

import java.util.List;
import java.util.stream.Collectors;

public class SeviceLayer {

    private DAO dao= null;

    public SeviceLayer(){
        this.dao = new DAO();
    }

    Student getStudent(int rollNo){
        return studentRecords(rollNo);
    }

    private Student studentRecords(int rollNo){
        List<Student> list = dao.getStudents()
                .stream().filter(x->x.getRollNo() == rollNo)
                .collect(Collectors.toList());
        return list.isEmpty() ? null : list.get(0);
    }
}
