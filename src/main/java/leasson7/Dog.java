package leasson7;

public class Dog extends Animals {
    private static int countDog;

    public Dog(String name) {
        super(name);
        countDog++;
    }

    @Override
    public void run(int range) {
        if (range <= 500) {
            System.out.println(name + " бежит " + range);
        } else {
            System.out.println(name + " Может бежать не больше 500 м");
        }
    }

    @Override
    public void swim(int range) {
        if (range > 10) {
            System.out.println(name + " не больше 10 метров");
        } else {
            System.out.println(name + " плывет " + range + " метров");
        }
    }

    public static int getCountDog() {
        return countDog;
    }
}