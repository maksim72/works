package lesson6;

public class Dog extends Animal{
    String name;
    public static int count = 0;

    public static int getCount(){
        return Dog.count;
    }

    public Dog(String name){
        this.name = name;
        Dog.count++;
    }
    @Override
    public void run(int distance) {
        if (distance >= 0 && distance <= 500) {
            System.out.println(name + " пробежал " + distance + " метров");
        } else System.out.println(name + " не может пробежать такую дистанцию");
    }

    @Override
    public void swim(int distance) {
        if (distance >= 0 && distance <= 10) {
            System.out.println(name + " проплыл " + distance + " метров");
        } else System.out.println(name + " не может проплыть такую дистанцию");
    }

    public static void dogsInfo(){
        System.out.println("Собак создано " + getCount());
    }
}
