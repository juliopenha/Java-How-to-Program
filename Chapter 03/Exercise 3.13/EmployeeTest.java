public class EmployeeTest {
  public static void main(String[] args) {
    Employee employee1 = new Employee("Timelo", "Rego", 1200.00);
    Employee employee2 = new Employee("Paula", "Tejano", 4300.00);

    System.out.printf("%s %s\'s annual salary before the raise is %.2f%n",
        employee1.getFirstName(),
        employee1.getLastName(),
        employee1.getSalary() * 12);

    System.out.printf("%s %s\'s annual salary before the raise is %.2f%n",
        employee2.getFirstName(),
        employee2.getLastName(),
        employee2.getSalary() * 12);

    employee1.setSalary(employee1.getSalary() * 1.1);
    employee2.setSalary(employee2.getSalary() * 1.1);

    System.out.printf("%s %s\'s annual salary after the raise is %.2f%n",
        employee1.getFirstName(),
        employee1.getLastName(),
        employee1.getSalary() * 12);

    System.out.printf("%s %s\'s annual salary after the raise is %.2f%n",
        employee2.getFirstName(),
        employee2.getLastName(),
        employee2.getSalary() * 12);
  }
}
