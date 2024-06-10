package less1.practice.impl.animal;

public class Cat extends Animal implements Swimmable {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getType() + " Пьет молоко из блюдечка");
    }

    @Override
    public void swim(double speed) {
        System.out.println("Мяу! Плыву");
    }
}
