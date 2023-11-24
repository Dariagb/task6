package solid5.task;

class LightBulb {
    public void turnOn() {
        // Включить лампочку
    }
}
//Класс Switch мы делаем конкретно для лампочки. Поэтому класс Switch всегда будет зависеть от класса лампочка.
//Если мы изменяем что- то в классе лампочка, то класс Switch не будет работать. Нарушается принцип инверсионной зависимости.
//Чтобы решить данную проблему мы вводим интерфейс Switchable
class Switch {
    private LightBulb bulb;

    public Switch() {
        bulb = new LightBulb();
    }

    public void operate() {
        bulb.turnOn();
    }
}