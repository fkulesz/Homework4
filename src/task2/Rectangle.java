package task2;

public class Rectangle {
    private int a = 5;
    private  int b = 6;

    Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }

    double rectPerimeter(){
        return a*2 + b*2;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
