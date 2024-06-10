package less1.practice.impl.animal;

import java.io.Serializable;

public abstract class Animal implements Serializable {

    public static int counter = 0;

    protected String name;

    public Animal(String name) {
        this.name = name;
        counter++;
    }

    public String getType() {

        return getClass().getSimpleName();
    }

    public abstract void eat();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
