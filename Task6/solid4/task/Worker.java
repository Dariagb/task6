package solid4.task;

interface Worker {
    void work();
    void eat();
    void sleep();
}
//Если необходимо применить одну функцию из интерфейса к инженеру, мы это не сможем сделать, так как интерфейс предполагает обязательства выполнения всех функций.
//Поэтому чтобы не реализовывать все функции, которые не нужны, мы разделяем интерфейсы.
//4 принцип- принцип разделения интерфейса.
//Получаем более предсказуемую работу , избавляем программу от методов, которые не используются.

class Engineer implements Worker {
    @Override
    public void work() {
        // Работа инженера
    }

    @Override
    public void eat() {
        // Перерыв на обед
    }

    @Override
    public void sleep() {
        // Сон после работы
    }
}

class Waiter implements Worker {
    @Override
    public void work() {
        // Обслуживание клиентов
    }

    @Override
    public void eat() {
        // Перерыв на обед
    }

    @Override
    public void sleep() {
        // Сон после работы
    }
}