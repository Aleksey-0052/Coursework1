public class Main {
    private static final Employee [] employees = {
            new Employee("Иванов Иван Иванович", 15000, 1),
            new Employee("Петров Петр Петрович", 18000, 1),
            new Employee("Михайлов Михаил Михайлович", 22000, 2),
            new Employee("Сергеев Сергей Сергеевич", 25000, 2),
            new Employee("Александров Александр Александрович", 23000, 3),
            new Employee("Дмитриев Дмитрий Дмитриевич", 29000, 3),
            new Employee("Алексеев Алексей Алексеевич", 32000, 4),
            new Employee("Павлов Павел Павлович", 24000, 4),
            new Employee("Андреев Андрей Андреевич", 19000, 5),
            new Employee("Николаев Николай Николаевич", 26000, 5)
    };

    public static void main(String[] args) {

        printEmployees();
        System.out.println("________________________________");

        System.out.println("Cумма всех зарплат: " + calculateTotalSalary());
        System.out.println("________________________________");

        System.out.println("Сотрудник с минимальной зарплатой: " + findEmployeeWithMinSalary());
        System.out.println("________________________________");

        System.out.println("Сотрудник с максимальной зарплатой: " + findEmployeeWithMaxSalary());
        System.out.println("________________________________");

        System.out.println("Средняя зарплата: " + calculateAverageSalary());
        System.out.println("________________________________");

        printFullNames();

    }

    // Базовая сложность

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static int calculateTotalSalary() {
        int salarySum = 0;

        for (Employee employee : employees) {
            salarySum += employee.getSalary();
        }

        return salarySum;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = employees[0];

        for (Employee employee : employees) {
            if (employee.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }

        return employeeWithMinSalary;
    }
    public static Employee findEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = employees[0];

        for (Employee employee : employees) {
            if (employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }

        return employeeWithMaxSalary;
    }

    public static float calculateAverageSalary() {

        return calculateTotalSalary() / (float) employees.length;
    }
    public static void printFullNames() {

        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

}