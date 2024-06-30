package leasson6;

import java.util.ArrayList;
import java.util.List;
//2.

public class Park {
    private String name;
    private List<Attraction> attractions;


    public Park(String name) {
        this.name = name;
        this.attractions = new ArrayList<>();
    }

    public void addAtttraction(String info, String wortTime, int price) {
        Attraction attraction = new Attraction(info, wortTime, price);
        attractions.add(attraction);
    }

    public void printInfo() {
        System.out.println(name);
        for (Attraction attraction : attractions) {
            System.out.println(attractions);
        }
    }


    static class Attraction {
        private String name;
        private String timeWork;
        private int price;

        private Attraction(String name, String timeWork, int price) {
            this.name = name;
            this.timeWork = timeWork;
            this.price = price;
        }

        @Override

        public String toString() {
            return "Attraction name: " + name + "\n" +
                    "Time Work : " + timeWork + "\n" +
                    "Price : " + price + "\n";
        }

    }
}