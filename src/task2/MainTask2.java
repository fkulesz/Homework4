package task2;

public class MainTask2 {
    public static void main(String[] args) {
        ShapeCalculator shape = new ShapeCalculator();
        Square square = new Square(6);
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5,7);
        Triangle1 triangle = new Triangle1(3,4,5);
        System.out.println("Powierzchnia kwadratu: " + square.squareArea());
        System.out.println("Powierzchnia koła: " + circle.circleArea());
        System.out.println("Obwód prostokata: " + rectangle.rectPerimeter());
        System.out.println("Obwod trojkata: "+ triangle.trianglePerimeter());

    }

}
