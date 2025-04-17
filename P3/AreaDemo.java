package P3;
class Shape {
    void getArea() {
        System.out.println("Calculating area of shape");
    }
}
class Rectangle extends Shape {
    int length = 5;
    int width = 3;

    void getArea() {
        int area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}
public class AreaDemo {
    public static void main(String[] args) {
        Shape genericShape = new Shape();
        genericShape.getArea();  

        Rectangle myRect = new Rectangle();
        myRect.getArea();      
    }
}
