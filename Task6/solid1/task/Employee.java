package solid1.task;

class Employee {
    private String name;
    private String address;

    public void calculateSalary() {
        // Расчет зарплаты сотрудника
    }
    //Необходимо разделить функции в разные классы.Если в будующем нам будет необходимо поменять какие -то данные в одной функции, это может повлиять на работу всего класса.
    // Появиться ошибка, мы не поймем в какой функции она проявляется.
    //Поэтому прибегаем к принципу "Единственной ответственности", 1 класс- 1 задача. Класс инкапсулирует решение одной задачи.


    public void saveEmployeeData() {
        // Сохранение данных сотрудника в базу данных
    }
}