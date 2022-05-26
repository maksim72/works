package lesson5;

public class Employee {
    private String fcs;
    private String post;
    private String email;
    private long number;
    private int salary;
    private int age;

    public Employee(String fcs, String post, String email, long number, int salary, int age) {
        this.fcs = fcs;
        this.post = post;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;

    }

    public String getFcs() {
        return fcs;
    }

    public void setFcs(String fcs) {
        this.fcs = fcs;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 150) {
            this.age = age;
        } else System.out.println("Введите корректное значение возраста");
    }

    @Override
    public String toString() {
        return "Фамилия Имя Отчество: " + fcs + ", Должность: " + post + ", email: " + email + ", Номер телефона: " + number + ", з/п: " + salary + ", Возраст: " + age;
    }

    public void print() {
        System.out.println(this);
    }
}
