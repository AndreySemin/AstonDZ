package leasson7;

public class Animals {
    public static void main(String[] args) {

        Cat Pushok = new Cat("Пушок");
        Cat Boris = new Cat("Борис");
        Dog Sharik = new Dog("Шарик");
        Dog Tyzik = new Dog("Tузик");

        Pushok.run(200);
        Boris.run(250);
        Sharik.run(500);
        Tyzik.run(550);

        Pushok.swim(10);
        Boris.swim(5);
        Sharik.swim(15);
        Tyzik.swim(10);


        Bowl bowl = new Bowl(20);
        Cat[] cats = {Pushok, Boris};

        for (Cat cat : cats) {
            cat.eat(bowl, 10);
            System.out.println(cat.getName() + " сыт " + cat.isFull());

        }

        System.out.println(" Остаток еды " + bowl.getFood());

        bowl.addFood(15);
        System.out.println(" Добавили " + bowl.getFood());


        for (Cat cat : cats) {
            if (!cat.isFull()) {
                cat.eat(bowl, 10);
                System.out.println(cat.getName() + " сыт " + cat.isFull());

            }
        }
        System.out.println("Остаток еды в миске " + bowl.getFood());


        System.out.println(" Всего животных " + Animal.getCountAnimal());
        System.out.println(" Всего котов " + Cat.getCountCat());
        System.out.println(" Всего собак " + Dog.getCountDog());


    }

    public static class Animal {
        static int countAnimal = 0;

        Animal() {
            countAnimal++;
        }

        public void run() {
            System.out.println(" может бегать ");
        }

        public void swim() {
            System.out.println(" может плыть ");
        }

        public static int getCountAnimal() {
            return countAnimal;
        }

        public void run(int range) {
        }

        public void swim(int range) {
        }


        public void eat(Bowl bowl, int amount) {

        }

    }

    public static class Cat extends Animals.Animal {
        String name;
        static int countCat = 0;
        private boolean isFull;

        Cat(String name) {
            super();
            countCat++;
            this.name = name;
        }

        @Override
        public void run(int range) {
            if (range > 200) {
                System.out.println(name + " Не больше 200 метров");
            } else {
                System.out.println(name + " Бежит " + range + " м");
            }

        }

        @Override
        public void swim(int range) {
            System.out.println(" Коты не умеют плавать");


        }

        @Override
        public void eat(Bowl bowl, int amount) {
            if (bowl.minFood(amount)) {
                this.isFull = true;
                System.out.println(name + " Сытый кот ");

            } else {
                System.out.println(name + " Мало еды не поел ");
            }
        }

        public boolean isFull() {
            return isFull;
        }


        static int getCountCat() {
            return countCat;
        }

        String getName() {
            return name;
        }


    }

    //Расширить задачу, добавив для котов возможность кушать из миски, выполнив следующие пункты:
    //Сделать так, чтобы в миске с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
    //Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
    //Считаем, что если коту мало еды в миске, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
    //Создать массив котов и миску с едой, попросить всех котов покушать из этой миски и потом вывести информацию о сытости котов в консоль.
    //Добавить метод, с помощью которого можно было бы добавлять еду в миску.

    static class Bowl {
        private int food;

        public Bowl(int food) {
            this.food = food;
        }

        public boolean minFood(int amount) {
            if (amount <= 0) {
                System.out.println(" Количество еды должно быть больше 0 ");
                return false;
            }

            if (food >= amount) {
                food -= amount;
                return true;
            }
            System.out.println(" Недостаточно еды в миске " + food);
            return false;

        }


        public void addFood(int amount) {
            if (amount > 0) {
                food += amount;
                System.out.println(" Добавили " + amount);
            } else {
                System.out.println(" Добавить больше ");
            }
        }

        public int getFood() {
            return food;
        }
    }

    public static class Dog extends Animals.Animal {
        String name;
        static int countDog = 0;

        Dog(String name) {
            super();
            countDog++;
            this.name = name;
        }

        @Override
        public void run(int range) {
            if (range > 500) {
                System.out.println(name + " Не больше 500 метров");
            } else {
                System.out.println(name + " бежит " + range + " м");
            }

        }

        @Override
        public void swim(int range) {
            if (range > 10) {
                System.out.println(name + " Не больше 10 метров");
            } else {
                System.out.println(name + " плывет " + range + " м");
            }
        }

        static int getCountDog() {
            return countDog;
        }


    }
}
