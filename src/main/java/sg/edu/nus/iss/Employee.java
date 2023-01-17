package sg.edu.nus.iss;

public class Employee {

    private Integer id;
    private String firstName;
    private String LastName;
    private Integer salary;
    
    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", LastName=" + LastName + ", salary=" + salary
                + "]";
    }
    public Employee(Integer id, String firstName, String lastName, Integer salary) {
        this.id = id;
        this.firstName = firstName;
        LastName = lastName;
        this.salary = salary;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return LastName;
    }
    public void setLastName(String lastName) {
        LastName = lastName;
    }
    public Integer getSalary() {
        return salary;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    
    
}
