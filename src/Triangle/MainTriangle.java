package Triangle;

public class MainTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.a = 3;
        triangle.b = 4;
        triangle.c = 5;
        System.out.println("czy trojkat jest prostokątny: " +  isRightTriangle(triangle));

    }
    public static boolean isRightTriangle(Triangle triangle){
        if(triangle.c * triangle.c == (triangle.b * triangle.b) + (triangle.a * triangle.a)){
            return true;
        } else {
            return false;
        }
    }
}
