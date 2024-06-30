import leasson7.Animals;
import leasson7.Figures;

public class Main  {
    public static void main(String[] args){
        Animals.Cat Pushok = new Animals.Cat("Пушок");
        Animals.Cat Boris = new Animals.Cat("Борис");
        Animals.Dog Sharik = new Animals.Dog("Шарик");
        Animals.Dog Tyzik = new Animals.Dog("Tузик");

        Pushok.run(200);
        Boris.run(250);
        Sharik.run(500);
        Tyzik.run(550);

        Pushok.swim(10);
        Boris.swim(5);
        Sharik.swim(15);
        Tyzik.swim(10);


        Animals.Bowl bowl = new Animals.Bowl(20);
        Animals.Cat[] cats = {Pushok, Boris};

        for (Animals.Cat cat : cats) {
            cat.eat(bowl, 10);
            System.out.println(cat.getName() + " сыт " + cat.isFull());

        }

        System.out.println(" Остаток еды " + bowl.getFood());

        bowl.addFood(15);
        System.out.println(" Добавили " + bowl.getFood());


        for (Animals.Cat cat : cats) {
            if (!cat.isFull()) {
                cat.eat(bowl, 10);
                System.out.println(cat.getName() + " сыт " + cat.isFull());

            }
        }
        System.out.println("Остаток еды в миске " + bowl.getFood());


        System.out.println(" Всего животных " + Animals.Animal.getCountAnimal());
        System.out.println(" Всего котов " + Animals.Cat.getCountCat());
        System.out.println(" Всего собак " + Animals.Dog.getCountDog());




            System.out.println(" Фигуры");
            Figures.Figure circle = new Figures.Circle("blue", "red", 5);
            Figures.Figure rectangle = new Figures.Circle.Rectangle(5, 9, "gren", "red");
            Figures.Figure triangle = new Figures.Circle.Triangl(5, 5, 5, "black", "yellow");

            System.out.println(" Круг :");
            circle.printCharacteristic();

            System.out.println(" Прямоугольник : ");
            circle.printCharacteristic();

            System.out.println(" Треугольник :");
            circle.printCharacteristic();


        }



}
