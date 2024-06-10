package less1.cat;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Animal  {

    protected String name;
    private final List<String> list;
    protected LocalDate birthDate;

    public Animal(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.list = new LinkedList<>();
    }

    public Animal(LocalDate a4gt4t, String ragt) {
        this.name = ragt;
        this.birthDate = a4gt4t;
        this.list = new LinkedList<>();
    }

    public List<String> getList() {
        List<String> copy = new LinkedList<>(list);
        return copy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
