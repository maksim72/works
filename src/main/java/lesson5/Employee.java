package lesson5;

public class Employee {
    String fcs;
    String post;
    String email;
    long number;
    int salary;
    int age;

    public Employee (String fcs, String post, String email, long number, int salary, int age) {
        this.fcs = fcs;
        this.post = post;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;

    }



    @Override
    public String toString() {
        return "Фамилия Имя Отчество: " + fcs + ", Должность: " + post + ", email: " + email + ", Номер телефона: " + number + ", з/п: " + salary + ", Возраст: " + age;
    }

    public void print(){
        System.out.println(this);
    }
}
