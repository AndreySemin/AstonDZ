package leasson6;

// 1.
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
