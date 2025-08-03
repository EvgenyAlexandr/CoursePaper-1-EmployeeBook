public class Main {
    public static void main(String[] args) {

//        // Создаем книгу сотрудников с вместимостью 10 записей
//        Employee[] employee = new Employee [10];
//
//        // Добавляем сотрудников
//        employee[0] = new Employee("Великий и ужасный Босс", 1, 100_000);
//        employee[1] = new Employee("Сотрудник 1", 1, 90_000);
//        employee[2] = new Employee("Сотрудник 2", 2, 20_000);
//        employee[3] = new Employee("Сотрудник 3", 3, 30_000);
//        employee[4] = new Employee("Сотрудник 4", 4, 40_000);
//        employee[5] = new Employee("Сотрудник 5", 5, 50_000);

//        // Отображаем всех сотрудников
//        System.out.println("Все сотрудники:");
//        printAll(employee);
//
//        // Сумма затрат на з/п в месяц
//        System.out.println();
//        System.out.println("Сумма З/П в месяц: " + getSalarySum(employee));
//
//        // Минимальная з/п
//        System.out.println();
//        System.out.println("Минимальная З/П : " + getMinSalart(employee));
//
//        // Максимальная з/п
//        System.out.println("Максимальная З/П: " + getMaxSalart(employee));
//
//        // Средняя з/п
//        System.out.println("Среднее З/П: " + getAverageSalary(employee));
//
//        // ФИО всех сотрудников
//        System.out.println("\nФИО сотрудников:");
//        printAllNames(employee);
//
//        //Индексация з/п
//        System.out.println("\nИндексация з/п:");
//        indexationSalary(employee, 10);

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
        System.out.println("\nСумма затрат на зарплаты: " + employeeBook.calculateTotalSalary());

        // Статистика по з/п
        System.out.println("Сотрудник с минимальной зарплатой: " + employeeBook.findEmployeeWithMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой: " + employeeBook.findEmployeeWithMaxSalary());
        System.out.println("Средняя зарплата: " + employeeBook.calculateAverageSalary());



    }

    // Отображаем всех сотрудников
    public static void printAll (Employee[] emp){
        for (int i = 0 ; i < emp.length && emp[i] != null; i++) {
            System.out.println(emp[i]);
        }
    }

    // Сумма З/П в месяц
    public static double getSalarySum(Employee[] emp) {
        double sum = 0;
        for (int i = 0; i < emp.length && emp[i] != null; i++) {
            sum = sum + emp[i].getSalary();
        }
        return sum;
    }

    // Минимальная З/П
    public static double getMinSalart(Employee[] emp){
        // уауммеумм
        double min = emp[0].getSalary();
        for (int i = 0; i < emp.length && emp[i] != null; i ++) {
            if (min > emp[i].getSalary()  ){
                min = emp[i].getSalary();
            }
        }
        return min;
    }

    // Максимальная з/п
    public static double getMaxSalart(Employee[] emp){
        double max = emp[0].getSalary();
        for (int i = 0; i < emp.length && emp[i] != null; i ++) {
            if (max < emp[i].getSalary()){
                max = emp[i].getSalary();
            }
        }
        return max;
    }

    // Средняя з/п
    public static double getAverageSalary(Employee[] emp){
        int countEmployee = 0;
        for (int i = 0; i < emp.length && emp[i] != null; i ++) {
            countEmployee++;
        }
        return getSalarySum(emp) / countEmployee;
    }

    // ФИО всех сотрудников
    public static void printAllNames(Employee[] emp){
        for (int i = 0; i < emp.length && emp[i] != null; i ++) {
            System.out.println(emp[i].getFullName());
        }
    }

    // Индексация з/п
    public static void indexationSalary (Employee[] emp, int indexSalary)
    {
        double selary = 0;

        for (int i = 0; i < emp.length && emp[i] != null; i ++) {
            selary = emp[i].getSalary();
            emp[i].setSalary(selary + selary / 100 * indexSalary);
            System.out.println(emp[i]);
        }

    }


}