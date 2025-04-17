package P8;
class Shape {
    void getPerimeter() {
        System.out.println("Calculating perimeter of shape");
    }

    void getArea() {
        System.out.println("Calculating area of shape");
    }
}

class Circle extends Shape {
    double radius = 7.0;

    void getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of Circle: " + perimeter);
    }

    @Override
    void getArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class Geo {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.getPerimeter();
        c.getArea();
    }
}
