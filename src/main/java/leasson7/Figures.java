package leasson7;

public class Figures {

    public interface Figure {
        double getPerimetr();

        double getArea();

        String getBorderColor();

        String getFullcolor();

        default void printCharacteristic() {
            System.out.println(" Цвет фона " + getFullcolor());
            System.out.println(" Цвет границ " + getBorderColor());
            System.out.println(" Периметр " + getPerimetr());
            System.out.println(" Площадь " + getArea());


        }


    }

    public static class Circle implements Figure {
        private double radius;
        private String fullColor;
        private String borderColor;

        public Circle(String fullColor, String borderColor, double radius) {
            this.borderColor = borderColor;
            this.fullColor = fullColor;
            this.radius = radius;
        }

        @Override
        public double getPerimetr() {
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

        public static class Rectangle implements Figure {
            private double width;
            private double heignt;
            private String fullColor;
            private String borderColor;

            public Rectangle(double width, double heignt, String fullColor, String borderColor) {
                this.width = width;
                this.heignt = heignt;
                this.fullColor = fullColor;
                this.borderColor = borderColor;
            }

            public double getPerimetr() {
                return 2 * (width + heignt);
            }

            public double getArea() {
                return width * heignt;
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

        public static class Triangl implements Figure {
            private double sideA;
            private double sideB;
            private double sideC;
            private String fullColor;
            private String bordercolor;

            public Triangl(double sideA, double sideB, double sideC, String fullColor, String bordercolor) {
                this.bordercolor = bordercolor;
                this.fullColor = fullColor;
                this.sideA = sideA;
                this.sideB = sideB;
                this.sideC = sideC;
            }

            public double getPerimetr() {
                return sideA + sideC + sideB;
            }

            public double getArea() {
                double s = getPerimetr() / 2.0;
                return Math.sqrt(s * (sideA) * s * (sideB) * s * (sideC));

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


    }
}
