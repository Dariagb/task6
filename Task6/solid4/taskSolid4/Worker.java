package solid4.taskSolid4;

interface Workable {
        void work();
        }
//4 принцип- принцип разделения интерфейса.
//Получаем более предсказуемую работу , избавляем программу от методов, которые не используются.

interface Eatable {
    void eat();
}

interface Sleepable {
    void sleep();
}

class Engineer implements Workable, Sleepable {
    @Override
    public void work() {
        // Работа инженера
    }

    @Override
    public void sleep() {
        // Сон после работы
    }
}

class Waiter implements Workable, Eatable, Sleepable {
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