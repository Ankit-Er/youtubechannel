package map;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Map<Employee,String> m = new TreeMap<>();
        m.put(new Employee("John",101), "John");
        m.put(new Employee("Ravi",102), "John");
        m.put(new Employee("Yaman",105), "John");
        m.put(new Employee("Riya",103), "John");
        System.out.println(m);
    }
}
