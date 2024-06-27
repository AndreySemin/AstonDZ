package leasson6;
//2. Создать массив из 5 сотрудников.
public class Person {
    private String fio;
    private String position;
    private String mail;
    private String tell;
    private int salary;
    private int age;

    public Person(String fio, String position, String mail, String tell, int salary, int age){
        this.fio = fio;
        this.position = position;
        this.mail = mail;
        this.tell = tell;
        this.salary = salary;
        this.age = age;
    }


    public static void main(String[] args){
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Sidorov Petr Petrovich", "Engineer", "petrov@mail.ru", "89290896241", 50000, 41);
        persArray[1] = new Person("Ivanov Ivan Ivanovich", "Manager", "ivaniv@mail.ru", "89053680405", 35000, 28);
        persArray[2] = new Person("Petrov Vladimir Vladimirovich", "Menager", "petrov@mail.ru", "89034567890", 3500, 24);
        persArray[3] = new Person("Kozlov Sergei Sergeevich", "SuperMennager", "Kozlov@mail.ru", "89063216549", 40000, 29);
        persArray[4] = new Person("Vasiliev Vasilii Vasilievich", "Manager", "vasiliev@mail.ru", "89279876542", 35000, 26);


    }


}
