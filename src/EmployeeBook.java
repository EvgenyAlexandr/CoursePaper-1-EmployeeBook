public class EmployeeBook {
    private final Employee[] employees;
    private int size;

    // Конструктор
    public EmployeeBook(int capacity) {
        this.employees = new Employee[capacity];
        this.size = 0;
    }

    // Добавление нового сотрудника
    public boolean addEmployee(String fullName, int department, double salary) {
        if (size >= employees.length) {
            return false;
        } else {
            employees[size++] = new Employee(fullName, department, salary);
            return true;
        }
    }

    // Вывод всех сотрудников
    public void printAllEmployees() {
        System.out.println("Список всех сотрудников (" + size + " из " + employees.length + "):");
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    // Сумма затрат на з/п в месяц
    public double calculateTotalSalary() {
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += employees[i].getSalary();
        }
        return total;
    }

    // Сотрудник с min з/п
    public Employee findEmployeeWithMinSalary() {
        if (size == 0) return null;
        Employee min = employees[0];
        for (int i = 1; i < size; i++) {
            if (employees[i].getSalary() < min.getSalary()) {
                min = employees[i];
            }
        }
        return min;
    }

    // Сотрудник с max з/п
    public Employee findEmployeeWithMaxSalary() {
        if (size == 0) return null;
        Employee max = employees[0];
        for (int i = 1; i < size; i++) {
            if (employees[i].getSalary() > max.getSalary()) {
                max = employees[i];
            }
        }
        return max;
    }

    // Расчет средней з/п
    public double calculateAverageSalary() {
        return size == 0 ? 0 : calculateTotalSalary() / size;
    }

    // Вывод ФИО всех сотрудников
    public void printAllEmployeesNames() {
        System.out.println("ФИО всех сотрудников:");
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i].getFullName());
        }
    }

    // Получение сотрудника по id
    public Employee getEmployeeById(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                return employees[i];
            }
        }
        return null;
    }

    // Удаление сотрудника по id
    public boolean removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                // Сдвигаем все элементы после удаляемого
                System.arraycopy(employees, i + 1, employees, i, size - i - 1);
                employees[--size] = null;
                return true;
            }
        }
        return false;
    }

}
