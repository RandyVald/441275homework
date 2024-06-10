package less1.practice.impl.animal;

public class Duck extends FlyingAnimal implements  Swimmable, Diveable {

    public Duck(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getType() + " Щиплет травку");
    }

    @Override
    public void fly() {
        System.out.println(getType() + " Кря! Я полетела");
    }

    @Override
    public void swim(double speed) {
        System.out.println("Кря! Я плыву со скоростью " + speed);
    }

    @Override
    public void swim() {
        System.out.println("Кря! Я плыву со скоростью 10");
    }

    @Override
    public void dive() {
        System.out.println("Кря! Я ныряю");
    }
}
