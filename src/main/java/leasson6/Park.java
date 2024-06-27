package leasson6;
//3. Создать класс Park с внутренним классом,
// с помощью объектов которого можно хранить информацию об аттракционах, времени их работы и стоимости.
public class Park {
    private String name;


    public Park(String name) {
        this.name = name;

    }

    public class Attractions {
        private String timeWork;
        private String info;
        private int prise;

        public Attractions(String timeWork, String info, int prise) {
            this.timeWork = timeWork;
            this.info = info;
            this.prise = prise;
        }
        public void getAttractions(String timeWork, String info, int prise){
            Attractions attractions = new Attractions(timeWork, info, prise);
        }

    }
    public String getName(String name){
        return name;
    }
    public String toString(){
        return String.format("Парк: %s",name);
    }
    public void print(){
        System.out.println(this);
    }
    public static void main(String[] args){
        Park park = new Park("Аркадия");
        Park.Attractions attractions = park.new Attractions("10:00 - 17:00", "Колесо", 200 );
        park.print();
        System.out.println("Название атракциона " + attractions.info);
        System.out.println("Время работы " + attractions.timeWork);
        System.out.println("Cтоимость " + attractions.prise);
    }


}
