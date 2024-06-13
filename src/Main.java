import java.util.List;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Employee> employeesList = new ArrayList<>();

        employeesList.add(new Intern("Jane Smith", "jane@example.com", 28, 12000));
        employeesList.add(new Employee("John Doe", "john@example.com", 30, 50000));
        employeesList.add(new Employee("Alice Johnson", "alice@example.com", 35, 54000));
        employeesList.add(new Employee("Bob Brown", "bob@example.com", 40, 56000));
        employeesList.add(new Employee("Charlie White", "charlie@example.com", 26, 58000));
        employeesList.add(new Employee("David Green", "david@example.com", 32, 60000));
        employeesList.add(new Employee("Eve Black", "eve@example.com", 29, 62000));
        employeesList.add(new Employee("Frank Grey", "frank@example.com", 27, 64000));
        employeesList.add(new Employee("Grace Blue", "grace@example.com", 31, 66000));
        employeesList.add(new Intern("Hank Red", "hank@example.com", 33, 8000));

        String filePath = "src/employees.txt";
        File file = new File(filePath);
        FileWriter fileWriter = new FileWriter(filePath, true);

        for (Employee employee : employeesList) {
            fileWriter.write(employee.toString() + "\n");
        }
        System.out.println("It's Done");
        fileWriter.close();

    }
}