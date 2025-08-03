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
        }
        employees[size++] = new Employee(fullName, department, salary);
        return true;
    }


}
