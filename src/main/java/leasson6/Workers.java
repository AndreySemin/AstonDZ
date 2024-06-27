package leasson6;
//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//Конструктор класса должен заполнять эти поля при создании объекта.
//Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
public class Workers {
    private String name;
    private String surname;
    private String position;
    private String mail;
    private String tell;
    private int salary;
    private int age;

    public Workers(String name, String surname, String position, String mail, String tell, int salary, int age) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.mail = mail;
        this.tell = tell;
        this.salary = salary;
        this.age = age;
    }

    public String toString() {
        return String.format("Имя: %s \n Фамилия: %s \n Должность: %s \n Почта: %s \n Телефон: %s \n Зарплата: %s \n Возраст: %s",
                name, surname, position, mail, tell, salary, age);

    }

    public void print() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        Workers workers = new Workers("Ivan", "Ivanov", "manager", "ivanov@mail.com", "89561235465", 35000, 35);
        workers.print();
    }
}
