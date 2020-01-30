package task2;

public class MainTask2 {
    public static void main(String[] args) {
        ShapeCalculator shape = new ShapeCalculator();
        Square square = new Square();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle1 triangle = new Triangle1();
        System.out.println("Powierzchnia kwadratu: " + shape.squareArea(square));
        System.out.println("Powierzchnia koła: " + shape.circleArea(circle));
        System.out.println("Obwód prostokata: " + shape.rectPerimeter(rectangle));
        System.out.println("Obwod trojkata: "+ shape.trianglePerimeter(triangle));

    }

}
