public class Main {
    public static void main(String[] args) {

        // Создаем книгу сотрудников с вместимостью 10 записей
        EmployeeBook employeeBook = new EmployeeBook(10);

        // Добавляем сотрудников
        System.out.println("Добавление сотрудников:");
        System.out.println("Добавлен: " + employeeBook.addEmployee("Великий и ужасный Босс", 1, 100_000));
        System.out.println("Добавлен: " + employeeBook.addEmployee("Сотрудник 1", 1, 90_000));
        System.out.println("Добавлен: " + employeeBook.addEmployee("Сотрудник 2", 2, 80_000));
        System.out.println("Добавлен: " + employeeBook.addEmployee("Сотрудник 3", 3, 70_000));
        System.out.println("Добавлен: " + employeeBook.addEmployee("Сотрудник 4", 4, 60_000));
        System.out.println("Добавлен: " + employeeBook.addEmployee("Сотрудник 5", 5, 50_000));

        // Выводим всех сотрудников
        System.out.println("\nВсе сотрудники:");
        employeeBook.printAllEmployees();

        // Сумма затрат на з/п в месяц
        System.out.println("\nСтатистика:");
        System.out.println("Сумма затрат на зарплаты: " + employeeBook.calculateTotalSalary());

        // Статистика по з/п
        System.out.println("Сотрудник с минимальной зарплатой: " + employeeBook.findEmployeeWithMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой: " + employeeBook.findEmployeeWithMaxSalary());
        System.out.println("Средняя зарплата: " + employeeBook.calculateAverageSalary());

        // Отображаем только ФИО
        System.out.println();
        employeeBook.printAllEmployeesNames();

        // Отображаем сотрудника по ID
        System.out.println();
        int testId = employeeBook.findEmployeeWithMinSalary().getId();
        System.out.println("Сотрудник с id=" + testId + ": " + employeeBook.getEmployeeById(testId));

        // Удаление сотрудника по ID
        System.out.println();
        System.out.println("Удаление сотрудника с id=" + testId);
        employeeBook.removeEmployee(testId);

        System.out.println("Проверка удаления:\n");
        employeeBook.printAllEmployees();

        System.out.println("\nПопытка добавить еще 6 сотрудников:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Добавлен " + (i+1) + ": " +
                    employeeBook.addEmployee("Тестовый Сотрудник " + (i+1), 5, 60_000 - i * 10_000));
        }
        System.out.println("\nТекущий список сотрудников:");
        employeeBook.printAllEmployees();

    }
}