package solid5.taskSolid5;

interface Switchable {
    void turnOn();
}
//принцип инверсионной зависимости
class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        // Включить лампочку
    }
}

class Fan implements Switchable {
    @Override
    public void turnOn() {
        // Включить вентилятор
    }
}
//в 22 строке мы создаем переменную типа Switchable. в 24 строке создаем конструктор, который принимает любой объект,
//который имплементирует класс Switchable. Таким образом у класса Switch своя зона ответственности и классы верхнего уровня не зависят от классов нижнего уровня.
class Switch {
    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void operate() {
        device.turnOn();
    }
}