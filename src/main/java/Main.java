//leasson9
/**
import leasson9.Phonebook;

import java.util.HashMap;
import java.util.Map;

import static leasson9.Array.createFreqMap;

public class Main {

    public static void main(String[] args) {
        String[] inputFruits = {"яблоко", "вишня", "персик", "яблоко", "виноград", "груша", "вишня", "ананас", "чернослив", "черемуха", "виноград", "слива", "ананас", "яблоко", "персик"};
        Map<String, Integer> freqMap = new HashMap<>(createFreqMap(inputFruits));
        System.out.print("Список уникальных слов: \n ");

        freqMap.forEach((k, v) -> System.out.print("\'" + k + "\' "));
        System.out.println();

        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println("Слово: \'" + k + "\' Повторений: " + v);
        }


        Phonebook.add("Иванов", "89576543214");
        Phonebook.add("Петров", "89652347898");
        Phonebook.add("Сидоров", "89063248796");
        Phonebook.add("Филимонов", "897436549874");
        Phonebook.get("Иванов");
        Phonebook.get("Петров");
        Phonebook.get("Попов");
**/
//leasson8
/**
import leasson8.MyArrayDataException;
import leasson8.MyArraySizeException;

public class Main {
    public static void main(String[] args){
        String[][] arr =new String[][]{{"5","3","4","1"},{"]","5","6","7"},{"8","9","1","1"},{"1","2","2","2","3"}};
        try {
            try {
                int result = mathod(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер превышен");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива");
            System.out.println("Ошибка в ячейке:"+ e.i+"x"+e.j);
        }
      **/

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




//lesson 6 Park
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

//lesson 6 Workers
        Park park = new Park("Аркадия");
        park.addAtttraction("Колесо", "10:00-20:00", 200);
        park.addAtttraction("Хали Гали", "10:00-20:00", 150);
        park.addAtttraction("Cупер 8 ", "10:00-20:00", 300);
        park.addAtttraction("Картинг", "10:00-20:00", 500);
        park.printInfo();
    }
    public static int mathod(String[][] arr) throws MyArraySizeException, MyArrayDataException{
        int count = 0;
        if(arr.length !=4){
            throw new MyArraySizeException();
        }
        for (int i = 0; i<arr.length; i++){
            if(arr[i].length !=4){
                throw new MyArraySizeException();
            }
            for (int j =0; j<arr.length; j++){
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return count;
    }


