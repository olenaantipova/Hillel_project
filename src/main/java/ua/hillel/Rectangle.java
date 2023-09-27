package ua.hillel;

public class Rectangle {
    double width;
    double length;

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    Rectangle() {

    }

    double calculateSquare() {
        return this.width * this.length;

    }
    double calculatePerimeter() {
        return 2*(this.width + this.length);
    }

}
