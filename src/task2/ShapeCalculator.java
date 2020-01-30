package task2;

public class ShapeCalculator {
    double squareArea(Square square){
       return square.getA()*square.getA();
    }
    double circleArea(Circle circle){
        return circle.getR()*circle.getR()*3.14;
    }
    double trianglePerimeter(Triangle1 triangle){
        return triangle.getA() + triangle.getB() + triangle.getC();
    }
    double rectPerimeter(Rectangle rectangle){
        return rectangle.getA()*2 + rectangle.getB()*2;
    }
}
