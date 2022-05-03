package lesson6;

public class Cat extends Animal{
    String name;
    public static int count = 0;

    public static int getCount(){
        return Cat.count;
    }

    public Cat(String name){
        this.name = name;
        Cat.count++;
    }
    @Override
    public void run(int distance) {
        if (distance >= 0 && distance <= 200) {
            System.out.println(name + " пробежал " + distance + " метров");
        } else System.out.println("Кот не может пробежать " + distance + "метров");
    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты не умеют плавать");
    }

    public static void catsInfo(){
        System.out.println("Котов создано " + getCount());
    }
}
