package leasson7.Tack2;

public class Trianglе implements Figure {
    private double sideA;
    private double sideB;
    private double sideC;
    private String fullColor;
    private String bordercolor;

    public Trianglе(double sideA, double sideB, double sideC, String fullColor, String bordercolor) {
        this.bordercolor = bordercolor;
        this.fullColor = fullColor;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getPerimeter() {
        return sideA + sideC + sideB;
    }

    public double getArea() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));

    }

    @Override
    public String getFullcolor() {
        return fullColor;
    }

    @Override
    public String getBorderColor() {
        return bordercolor;
    }

}



