package leasson7.Tack2;

public class Circle implements Figure {
    private double radius;
    private String fullColor;
    private String borderColor;

    public Circle(String fullColor, String borderColor, double radius) {
        this.borderColor = borderColor;
        this.fullColor = fullColor;
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }


    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }


    @Override
    public String getFullcolor() {
        return fullColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }


}
