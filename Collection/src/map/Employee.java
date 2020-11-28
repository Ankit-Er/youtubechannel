package map;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private String name;
    private int empId;

    public Employee(String name, int empId) {
        super();
        this.name = name;
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }

    @Override
    public int compareTo(Employee o) {
        return this.empId - o.empId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId &&
                name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, empId);
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", empId=" + empId + "]";
    }

}
