package leasson7;

public class Cat extends Animal {
    private boolean isFull = false;
    private static int countCats;
    public static final int MAX_DISTANCE = 200;


    public Cat(String name) {
        super(name);
        countCats++;
    }

    public Cat(String name, boolean isFull) {
        super(name);
        this.isFull = false;
        countCats++;
    }

    public static int getCountCats() {
        return countCats;
    }

    @Override
    public void run(int range) {
        if (range > MAX_DISTANCE) {
            System.out.println(name + " Может бежать не больше 200 метров ");
        } else {
            System.out.println(name + " Бежит " + range + " метров.");
        }

    }

    @Override
    public void swim(int range) {
        System.out.println("Коты не умеют плавать");
    }

    @Override
    public void eat(Bowl bowl, int amount) {
        if (bowl.minFood(amount)) {
            this.isFull = true;
            System.out.println(name + " кот сыт");
        } else {
            System.out.println(name + " мало еды не поел");
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public String getName() {
        return name;
    }


}