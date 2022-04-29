package lesson6;

public class MainApp {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик");
        cat1.run(100);
        cat1.swim(10);
        Cat cat2 = new Cat("Вася");
        Cat cat3 = new Cat("Персик");
        Cat.catsInfo();

        Dog dog1 = new Dog("Бобик");
        dog1.run(100);
        dog1.swim(10);
        Dog dog2 = new Dog("Шарик");
        Dog.dogsInfo();

        Animal.animalInfo();
    }
}
