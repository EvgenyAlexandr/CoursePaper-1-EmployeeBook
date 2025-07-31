public class Main {
    public static void main(String[] args) {

        // Создаем книгу сотрудников с вместимостью 10 записей
        Employee[] employee = new Employee [10];


        // Добавляем сотрудников
        System.out.println("Добавление сотрудников:");

        employee[0] = new Employee("Великий и ужасный Босс", 1, 100_000);
        employee[1] = new Employee("Сотрудник 1", 1, 90_000);
        employee[2] = new Employee("Сотрудник 2", 2, 20_000);
        employee[3] = new Employee("Сотрудник 3", 3, 30_000);
        employee[4] = new Employee("Сотрудник 4", 4, 40_000);
        employee[5] = new Employee("Сотрудник 5", 5, 50_000);

        printAll(employee);


    }

    public static void printAll (Employee[] emp){
        for (int i = 0 ; i < emp.length; i++) {
            System.out.println(emp[i]);
        }
    }
}