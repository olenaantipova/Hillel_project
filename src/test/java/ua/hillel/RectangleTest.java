package ua.hillel;

import org.testng.annotations.Test;


public class RectangleTest {
    @Test
    public void squareRectangle() {
        Rectangle rectangle = new Rectangle(15,5);
        System.out.println("Square is " + rectangle.calculateSquare());
    }
    @Test
    public void perimeterRectangle() {
        Rectangle rectangle = new Rectangle(15,5);
        System.out.println("Perimeter is " + rectangle.calculatePerimeter());
    }
}
