package task2;

public class Triangle1 {
    private  int a = 3;
    private  int b = 4;
    private  int c = 5;
    private  int h = 4;

    Triangle1(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double trianglePerimeter(){
        return a+b+c;
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

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
}
