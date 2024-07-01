package leasson7;

public abstract class Animals {
    public static int countAnimals = 0;
    protected String name;

    Animals() {
        countAnimals++;
    }

    public Animals(String name) {
        this.name = name;
        countAnimals++;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

    public static int getCountAnimals() {
        return countAnimals;
    }

    public void eat(Bowl bowl, int amount) {

    }


}