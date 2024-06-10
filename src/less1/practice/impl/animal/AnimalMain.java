package less1.practice.impl.animal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AnimalMain {

    public static void main(String[] args) {
        Animal cat = new Cat("Tom");

        Swimmable duck = new Duck("Donald");

        ((FlyingAnimal) duck).eat();

        FlyingAnimal duck2 = (FlyingAnimal) duck;

        duck2.eat();
        duck2.fly();

        duck.swim(12d);

        cat.eat();

        Duck duck3 = new Duck("DonaldTrupm"); // swim dive fly duck

        duck3.eat();
        duck3.fly();
        duck3.swim(12d);
        duck3.swim();

        List<Swimmable> swimmables = List.of(duck, new Ship(), duck3);

        Cat c = new Cat("Tom");
        System.out.println(Animal.counter);

//        Swimmable[] s = new Swimmable[swimmables.size()];

//        Swimmable swimmable = new Swimmable() {
//            @Override
//            public void swim(double speed) {
//                System.out.println(speed/2);
//            }
//        };
//
//        Swimmable swimmable2 = (x -> System.out.println(x*x));

        Swimmable swimmable = new Swimmable() {
            @Override
            public void swim(double speed) {
                System.out.println(speed/2);
            }

        };

        Swimmable swimmable2 = (x -> System.out.println(x*x));

        swimmable2.swim(12);
        swimmable.swim(12);

        final List<Integer> list = new LinkedList<>();
        System.out.println(list);
        list.add(12);
        System.out.println(list);
    }
}
