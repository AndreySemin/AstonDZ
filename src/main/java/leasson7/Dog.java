package leasson7;

public class Dog extends Animal {
    private static int countDog;

    public static final int MAX_RUN_DISTANCE = 500;
    private static final int MAX_SWIM_DISTANCE = 10;

    public Dog(String name) {
        super(name);
        countDog++;
    }

    @Override
    public void run(int range) {
        if (range <= MAX_RUN_DISTANCE) {
            System.out.println(name + " бежит " + range);
        } else {
            System.out.println(name + " Может бежать не больше 500 м");
        }
    }

    @Override
    public void swim(int range) {
        if (range > MAX_SWIM_DISTANCE) {
            System.out.println(name + " Может плыть больше 10 метров");
        } else {
            System.out.println(name + " плывет " + range + " метров");
        }
    }

    public static int getCountDog() {
        return countDog;
    }
}