package assignment2;

import java.time.LocalDate;

public class EmployeeFull {
    private int id;
    private String name;
    private String department;
    private double salary;
    private LocalDate joiningDate;

    public EmployeeFull(int id, String name, String department, double salary, LocalDate joiningDate) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.joiningDate = joiningDate;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public LocalDate getJoiningDate() { return joiningDate; }

    @Override
    public String toString() {
        return name + " [" + department + ", $" + salary + ", Joined: " + joiningDate + "]";
    }
}
