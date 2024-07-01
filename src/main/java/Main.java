import leasson7.Animals;
import leasson7.Bowl;
import leasson7.Cat;
import leasson7.Dog;
import leasson7.Tack2.Circle;
import leasson7.Tack2.Figure;
import leasson7.Tack2.Rectangle;
import leasson7.Tack2.Triangl;

public class Main {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog("Бобик"), new Dog("Пёсель"), new Dog("Шарик"), new Dog("Тузик")};
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
        System.out.println("Всего собак:" + Dog.getCountDog());

        dogs[0].run(600);
        dogs[1].run(300);
        dogs[2].swim(5);
        dogs[3].swim(20);

        Cat[] cats = {new Cat("Мурзик"), new Cat("Борис"), new Cat("Киса")};
        for (Cat cat : cats) {
            System.out.println(cat);
        }
        System.out.println("Всего котов:" + Cat.getCountCats());

        cats[0].swim(10);
        cats[1].run(250);
        cats[2].run(100);

        System.out.println("Всего животных:" + Animals.getCountAnimals());

        Bowl bowl = new Bowl(20);

        for (Cat cat : cats) {
            cat.eat(bowl, 10);

            System.out.println("Остаток еды " + bowl.getFood());
        }

        bowl.addFood(30);
        System.out.println("Добавили " + bowl.getFood());

        for (Cat cat : cats) {
            if (!cat.isFull()) {
                cat.eat(bowl, 10);
                System.out.println(cat.getName() + " сыт " + cat.isFull());
            }
            System.out.println("Остаток еды в миске " + bowl.getFood());
        }

        System.out.println("Фигуры");
        Figure circle = new Circle("blue", "red", 10);
        Figure rectangle = new Rectangle(5, 9, "gren", "red");
        Figure triangle = new Triangl(5, 5, 5, "black", "yellow");
        System.out.println("Круг");
        circle.printCharacteristic();
        System.out.println("Прямоугольник");
        rectangle.printCharacteristic();
        System.out.println("Треугольник");
        triangle.printCharacteristic();


    }
}






