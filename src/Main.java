public class Main {
    public static void main(String[] args) {

        // Создаем книгу сотрудников с вместимостью 10 записей
        Employee[] employee = new Employee [10];


        // Добавляем сотрудников
        employee[0] = new Employee("Великий и ужасный Босс", 1, 100_000);
        employee[1] = new Employee("Сотрудник 1", 1, 90_000);
        employee[2] = new Employee("Сотрудник 2", 2, 20_000);
        employee[3] = new Employee("Сотрудник 3", 3, 30_000);
        employee[4] = new Employee("Сотрудник 4", 4, 40_000);
        employee[5] = new Employee("Сотрудник 5", 5, 50_000);

        // Отображаем всех сотрудников
        System.out.println("Все сотрудники:");
        printAll(employee);

        // Сумма затрат на з/п в месяц
        System.out.println();
        System.out.println("Сумма З/П в месяц: " + getSalarySum(employee));

        // Минимальная з/п
        System.out.println();
        System.out.println("Минимальная З/П : " + getMinSalart(employee));

        // Максимальная ЗП
        System.out.println();
        System.out.println("Максимальная З/П: " + getMaxSalart(employee));



    }


    public static void printAll (Employee[] emp){
        for (int i = 0 ; i < emp.length && emp[i] != null; i++) {
            System.out.println(emp[i]);
        }
    }

    public static double getSalarySum(Employee[] emp) {
        double sum = 0;
        for (int i = 0; i < emp.length && emp[i] != null; i++) {
            sum = sum + emp[i].getSalary();
        }
        return sum;
    }

    public static double getMinSalart(Employee[] emp){
        double min = emp[0].getSalary();
        for (int i = 0; i < emp.length && emp[i] != null; i ++) {
            if (min > emp[i].getSalary()  ){
                min = emp[i].getSalary();
            }
        }
        return min;
    }

    public static double getMaxSalart(Employee[] emp){
        double max = emp[0].getSalary();
        for (int i = 0; i < emp.length && emp[i] != null; i ++) {
            if (max < emp[i].getSalary()){
                max = emp[i].getSalary();
            }
        }
        return max;
    }


}