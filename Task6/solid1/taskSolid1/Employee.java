package solid1.taskSolid1;

class Employee {
    private String name;
    private String address;

    public void calculateSalary() {
        // Расчет зарплаты сотрудника
    }
}
//1 класс-1задача. Принцип единственной ответственности
class EmployeeRepository {
    public void saveEmployeeData(Employee employee) {
        // Сохранение данных сотрудника в базу данных
    }
}
