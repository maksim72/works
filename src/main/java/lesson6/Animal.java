package lesson6;

public class Animal {

    public static int count = 0;
    public Animal(){
        Animal.count++;
    }

    public static int getCount(){
        return Animal.count;
    }

    public static void animalInfo(){
        System.out.println("Животных создано " + getCount());
    }

    public void run(int distance){
        System.out.println("Животное пробежало " + distance + " метров");
    }

    public void swim(int distance){
        System.out.println("Животное подпрыгнуло на " + distance + " метров");
    }
}
