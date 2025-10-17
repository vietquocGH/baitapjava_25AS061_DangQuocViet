public class Employee4 {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    public Employee4(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;}
    public String getName () {
        return firstName +""+lastName;}
    public int getSalary() {
        return salary;}
    public void setSalary(int salary) {
        this.salary = salary;}
    public int getAnnualSalary() {
        return salary * 12;}
    public int raiseSalary(int percent) {
        double newSalaryDouble = salary * (1 * percent / 100.0);
        this.salary=(int)Math.round(newSalaryDouble);
        return this.salary;
    }
    @Override
    public String toString() {
        return "Employee[id=" + id + ",name=" + getName() + ",salary=" + salary + "]";
    }
}
