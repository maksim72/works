package lesson7;

public class Cat{

    private String name;
    private int appetite;

    private boolean satiety = false;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (p.getFood() - appetite >= 0) {
            p.decreaseFood(appetite);
            appetite -= appetite;
            System.out.println(name + " покушал");
        } else System.out.println(name + " не покушал: не хватило еды");
    }

    public void info(){
        if (appetite == 0){
            satiety = true;
            System.out.println("Кот " + name + " сытость " + satiety);
        } else System.out.println("Кот " + name + " сытость " + satiety);
    }
}
