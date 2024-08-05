/**

//lesson7
import leasson7.Animal;
import leasson7.Bowl;
import leasson7.Cat;
import leasson7.Dog;
import leasson7.Tack2.Circle;
import leasson7.Tack2.Figure;
import leasson7.Tack2.Rectangle;
import leasson7.Tack2.Trianglе;

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

        System.out.println("Всего животных:" + Animal.getCountAnimals());

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
        Figure triangle = new Trianglе(5, 5, 5, "black", "yellow");
        System.out.println("Круг");
        circle.printCharacteristic();
        System.out.println("Прямоугольник");
        rectangle.printCharacteristic();
        System.out.println("Треугольник");
        triangle.printCharacteristic();**/


//lesson 6
/**
import leasson6.Park;
import leasson6.Workers;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Создать массив из 5 сотрудников.
        Workers[] workers = new Workers[5];
        workers[0] = new Workers("Ivan", "Ivanov", "manager", "ivanov@mail.com", "89561235465", 35000, 35);
        workers[1] = new Workers("Petr", "Sidorov", "manager", "sidorov@mail.ru", "87846541232", 30000, 28);
        workers[2] = new Workers("Oleg", "Fedorov", "Direktor", "direktor@mail.ru", "89743215894", 50000, 40);
        workers[3] = new Workers("Fedor", "Smirnov", "manager", "smirnov@mail.ru", "89603254789", 30000, 39);
        workers[4] = new Workers("Elena", "Ivanova", "manager", "ivanova@mail.ru", "89674563214", 35000, 23);

        Arrays.stream(workers).forEach(Workers::printInfo);
        **/
  master


        Park park = new Park("Аркадия");
        park.addAtttraction("Колесо", "10:00-20:00", 200);
        park.addAtttraction("Хали Гали", "10:00-20:00", 150);
        park.addAtttraction("Cупер 8 ", "10:00-20:00", 300);
        park.addAtttraction("Картинг", "10:00-20:00", 500);
        park.printInfo();
    }
}







