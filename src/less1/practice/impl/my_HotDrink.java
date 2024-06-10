package less1.practice.impl;

import java.time.LocalDate;

import less1.practice.Product;

public class my_HotDrink extends Product {

    private int temp;
    private int volume;

    public my_HotDrink(String name, double price, LocalDate releaseDate, int temp, int volume) {
        super(name, price, releaseDate);
        this.temp = temp;
        this.volume = volume;
    }

    public int getTemperature() {
        return temp;
    }
    
    public int getVolume() {
        return volume;
    }






   
}
