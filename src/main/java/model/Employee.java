package model;

public class Employee extends Person {

    private String department;

    public Employee() {
    }

    public Employee(String name,
                    String email,
                    String department) {

        super(name, email);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}