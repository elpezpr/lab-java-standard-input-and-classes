public class Intern extends Employee {
    private static final int SALARY_LIMIT = 20000;

    public Intern(String name, String email, int age, int salary) {
        super(name, email, age, 0); // Pass a default value to the super constructor
        if (salary > SALARY_LIMIT) {
            throw new IllegalArgumentException("Salary exceeds the limit for an intern");
        } else {
            setSalary(salary);
        }
    }
}