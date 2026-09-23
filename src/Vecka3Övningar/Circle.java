package Vecka3Övningar;

public class Circle {

    int radius;
    double area;
    double omkrets;

    public Circle(int radius) {
        this.radius = radius;

    }

    public double calculateArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    public double calculateCircumference() {
        double omkrets = 2 * Math.PI * radius;
        return omkrets;
    }
    public String hasSmallArea () {
        if (area < omkrets) {
            return "True";
        } return "False";

    }
}
