public class TestEmployee4 {
    public static void main(String[] args) {
        Employee4 e1 = new Employee4(8, "Peter", "Tan", 2500);
        System.out.println(e1);
        e1.setSalary(999);
        System.out.println(e1);
        System.out.println("id là: " + e1.getId());
        System.out.println("tên là: " + e1.getFirstName());
        System.out.println("họ là: " + e1.getLastName());
        System.out.println("lương là: " + e1.getSalary());

        System.out.println("tên là: " + e1.getName());
        System.out.println("lương hàng năm là: " + e1.getAnnualSalary());

        System.out.println(e1.raiseSalary(10));
        System.out.println(e1);
    }
}

