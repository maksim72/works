package lesson7;

public class MainApp {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Барсик", 15);
        cats[1] = new Cat("Петька", 10);
        cats[2] = new Cat("Шарик", 20);
        cats[3] = new Cat("Черныш", 13);
        cats[4] = new Cat("Рыжик", 5);
        Plate plate = new Plate(50);
        for (int i = 0; i < 5; i++){
            cats[i].eat(plate);
            cats[i].info();
        }

    }
}
