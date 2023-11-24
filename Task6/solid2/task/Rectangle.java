package solid2.task;

class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
//Класс не открыт для изменений. Это очень неудобно, если необходимо добавить какие-то элементы, например, длугие фигуры, нам придется изменять класс AreaCalculator.
// Нарушается принцип открытости\закрытости.
//(Программные сущности долны быть открыты для расширений, но закрыты для изменнений). Чтобы разрешить эту проблему добавляем новый класс - интерфейс.
class AreaCalculator {
    public double calculateArea(Rectangle rectangle) {
        return rectangle.getWidth() * rectangle.getHeight();
    }
}