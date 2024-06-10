package less1.practice.impl.animal;

public interface Swimmable {

    public static String type = "Swimmable";

    // public abstract не пишется тк итак есть по ум.
    public abstract void swim(double speed);
//    int foo();

    public default void swim() {
        System.out.println("Плывет со скоростью 5");
    };
}
