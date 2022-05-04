package lesson5;

public class MainApp {
    public static void main(String[] args) {
        Employee emp = new Employee("Вожаков Максим Аркадьевич", "Аналитик", "asdfghjk@mail.ru", 81111111111l, 35000, 25);
        emp.print();// Проверка вывода на экран(Задание 3) -> Метод прописан в классе "Employee"
        System.out.println();
        System.out.println();

        Employee[] employees = new Employee[5];//Задание 4
        employees[0] = new Employee("Вожаков Максим Аркадьевич", "Аналитик", "asdfghjk@mail.ru", 81111111111l, 35000, 25);
        employees[1] = new Employee("Петров Петр Петрович", "Аналитик", "asdfghjk@mail.ru", 81111111111l, 35000, 45);
        employees[2] = new Employee("Иванов Иван Иванович", "Аналитик", "asdfghjk@mail.ru", 81111111111l, 35000, 55);
        employees[3] = new Employee("Дмитриев Дмитрий Дмитриевич", "Аналитик", "asdfghjk@mail.ru", 81111111111l, 35000, 30);
        employees[4] = new Employee("Николаев Николай Николаевич", "Аналитик", "asdfghjk@mail.ru", 81111111111l, 35000, 28);

        for (int i = 0; i < employees.length; i++){//Задание 5
            if (employees[i].getAge() >= 40){
                employees[i].print();
            }
        }

    }
}
