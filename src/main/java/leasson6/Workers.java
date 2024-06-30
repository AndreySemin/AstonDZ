package leasson6;

//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//Конструктор класса должен заполнять эти поля при создании объекта.
//Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
public class Workers {
    private String name;
    private String surname;
    private String position;
    private String mail;
    private String tel;
    private int salary;
    private int age;

    public Workers(String name, String surname, String position, String mail, String tel, int salary, int age) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.mail = mail;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.printf("Имя: %s \n Фамилия: %s \n Должность: %s \n Почта: %s \n Телефон: %s \n Зарплата: %s \n Возраст: %s",
                name, surname, position, mail, tel, salary, age);
        System.out.println();


    }


}
