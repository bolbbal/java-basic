package oop1.ex;

public class Rectangle {
    int width;
    int height;

    int area() {
        System.out.println("넓이: " + (width * height));
        return width * height;
    }

    int perimeter() {
        System.out.println("둘레 길이: " + (2 * (width + height)));
        return 2 * (width + height);
    }

    boolean isSquare() {
        System.out.println("정사각형 여부: " + (width == height));
        return width == height;
    }
}
