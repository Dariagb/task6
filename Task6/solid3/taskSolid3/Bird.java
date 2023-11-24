package solid3.taskSolid3;

interface Bird {
    void move();
}
//Для решения данной задачи вводим интерфейс Bird у которого есть абстрактный метод move() - двигаться. Логика не нарушается
// И если нам будет необходимо ввести класс с новой птицей, мы легко опишем способ ее передвижения.
class Sparrow implements Bird {
    @Override
    public void move() {
        // Полет воробья
    }
}

class Ostrich implements Bird {
    @Override
    public void move() {
        // Движение страуса, не включает полет
    }
}