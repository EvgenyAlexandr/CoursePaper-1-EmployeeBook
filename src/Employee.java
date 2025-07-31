import java.util.Objects;

public class Employee {
    private final String fullName;      // ФИО Сотрудника
    private int department;             // Номер Отдела
    private double salary;              // з/п

    private static int counter = 1;     // Счетчик
    private final int id;               // поле id

    // Конструктор
    public Employee(String fullName, int department, double salary) {
        this.id = counter++;
        this.fullName = fullName;
        setDepartment(department);
        setSalary(salary);
    }

    // Геттеры
    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    // Сеттеры
    public void setDepartment(int department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Отдел должен быть от 1 до 5");
        }
        this.department = department;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Зарплата не может быть отрицательной");
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Запись № " + id + ", ФИО:\"" + fullName + "\", Отдел " + department + ", Зарплата: " + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
