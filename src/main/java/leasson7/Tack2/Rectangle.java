package leasson7.Tack2;

public class Rectangle implements Figure {
    private double width;
    private double heignt;
    private String fullColor;
    private String borderColor;

    public Rectangle(double width, double height, String fullColor, String borderColor) {
        this.width = width;
        this.heignt = height;
        this.fullColor = fullColor;
        this.borderColor = borderColor;
    }

    public double getPerimeter() {
        return 2 * (width + heignt);
    }

    public double getArea() {
        return width * heignt;
    }

    public String getFullcolor() {
        return fullColor;
    }


    public String getBorderColor() {
        return borderColor;
    }
}


