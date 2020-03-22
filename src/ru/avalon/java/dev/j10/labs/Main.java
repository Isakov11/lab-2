package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.*;

public class Main {

    public static void main(String[] args) {
        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         */        
        Shape[] shapes = {
            new Circle(new FloatPoint(1.2f, 2.3f), 3f),
            new Circle(new FloatPoint(5.1f, 10.3f), 5f),
            new Triangle(new FloatPoint(3f, 0f), new FloatPoint(4f, 1f),new FloatPoint(-3f, 0f),180),
            new Triangle(new FloatPoint(10f, 5f), new FloatPoint(15f, 0f),new FloatPoint(6f, -8f),70),
            new Triangle(new FloatPoint(7f, 2f), new FloatPoint(4f, 9f),new FloatPoint(-3f, 0f),80),
            new Circle(new FloatPoint(15f, -6f), 2f),
            new Rectangle(new FloatPoint(0f, 0f), new FloatPoint(15f, 15f),0),
            new Rectangle(new FloatPoint(0f, 0f), new FloatPoint(5f, 5f),0),
            new Rectangle(new FloatPoint(0f, 0f), new FloatPoint(4f, 4f),0),
            new Rectangle(new FloatPoint(0f, 0f), new FloatPoint(3f, 3f),0)
        };
         /*
         *2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Main).
         */
         Shape maxShape = MaxArea(shapes);
    }
    
    static Shape MaxArea(Shape Shapes[]){
        float area = 0f;
        Shape tempShape = null;
        for (Shape shape : Shapes){
            if (shape.getArea() > area){
                area=shape.getArea();
                tempShape = shape;
            }
        }
        return tempShape;
    };
}
