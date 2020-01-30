package task2;

public class Circle {
    private int r;

    Circle(int r){
        this.r = r;
    }

    double circleArea(){
        return r*r*3.14;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}
