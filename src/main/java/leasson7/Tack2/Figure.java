package leasson7.Tack2;
// 2. Применяя интерфейсы написать программу расчета периметра и площади
// геометрических фигур: круг, прямоугольник, треугольник.

public interface Figure {

    double getPerimetr();

    double getArea();


    String getBorderColor();

    String getFullcolor();

    default double printCharacteristic() {

        System.out.println(" Цвет фона " + getFullcolor());
        System.out.println(" Цвет границ " + getBorderColor());
        System.out.println(" Периметр " + getPerimetr());
        System.out.println(" Площадь " + getArea());

        return 0;
    }
}


