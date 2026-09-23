package Vecka3Övningar;

public class RectangleMain {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(5, 5);

        System.out.println("Area: " + rectangle1.calculateArea());
        System.out.println("Omkrets: " + rectangle1.calculatePerimeter());
        System.out.println("Rektangeln är " + rectangle1.isSquare());
    }
}
