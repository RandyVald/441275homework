package less1.cat;

//примитивы - ссылочные


import less1.Owner;

import java.time.LocalDate;

public class Cat extends Animal {

    Owner owner;

    public Cat(String name, LocalDate birthDate, Owner owner) {
        super(name, birthDate);
        this.owner = owner;
    }

    public Cat(String name, LocalDate birthDate) {
        super(name, birthDate);
    }

    public Owner getOwner() {
        return owner;
    }

}
