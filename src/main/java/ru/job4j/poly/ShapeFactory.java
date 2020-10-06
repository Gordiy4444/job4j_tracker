package ru.job4j.poly;

public class ShapeFactory {
    public static Shape create(String name) {
        Shape shape = new EmptyShape();
        if ("triangle".equals(name)) {
            shape = new TriangleShape();
        } else if ("rectangle".equals(name)) {
            shape = new RectangleShape();
        }
        return shape;
    }

    public static void main(String[] args) {
        Shape shape = ShapeFactory.create("cycle");
        System.out.println(shape);
    }
}
