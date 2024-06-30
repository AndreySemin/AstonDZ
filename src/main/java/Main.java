import leasson6.Park;
import leasson6.Workers;

import java.util.Arrays;

public class Main  {
    public static void main(String[] args) {
        Workers[] workers = new Workers[5];
        workers[0] = new Workers("Ivan", "Ivanov", "manager", "ivanov@mail.com", "89561235465", 35000, 35);
        workers[1] = new Workers("Petr", "Sidorov", "manager", "sidorov@mail.ru", "87846541232", 30000, 28);
        workers[2] = new Workers("Oleg", "Fedorov", "Direktor", "direktor@mail.ru", "89743215894", 50000, 40);
        workers[3] = new Workers("Fedor", "Smirnov", "manager", "smirnov@mail.ru", "89603254789", 30000, 39);
        workers[4] = new Workers("Elena", "Ivanova", "manager", "ivanova@mail.ru", "89674563214", 35000, 23);

        Arrays.stream(workers).forEach(Workers::printInfo);


        Park park = new Park("Аркадия");
        park.addAtttraction("Колесо", "10:00-20:00", 200);
        park.addAtttraction("Хали Гали", "10:00-20:00", 150);
        park.addAtttraction("Cупер 8 ", "10:00-20:00", 300);
        park.addAtttraction("Картинг", "10:00-20:00", 500);
        park.printInfo();
    }
}

