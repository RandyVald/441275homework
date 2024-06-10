package less1;

import less1.cat.Animal;
import less1.cat.Cat;
import less1.cat.Dog;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cat barsik = new Cat(
                "Barsic",
                LocalDate.of(1990, 1, 1),
                new Owner()
        );

        Animal animal1 = new Animal(LocalDate.now(), "Animal-1");


        System.out.println(barsik.getName());

        barsik.setName("Tom");

        System.out.println(barsik.getType());

        Dog dog1 = new Dog("Dog-1", LocalDate.now());

        System.out.println(dog1.getType());

        Owner o = new Owner();
        Animal animalCat = new Cat("Cat-1", LocalDate.now(), new Owner());

        Cat x = (Cat) animalCat;

        System.out.println(x.getName());

        List<Animal> animals = List.of(animal1, animalCat, barsik);

        System.out.println(animals);
    }

}
