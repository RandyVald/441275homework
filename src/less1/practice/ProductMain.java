package less1.practice;

import less1.practice.impl.BottleOfWater;
import less1.practice.impl.EPackage;
import less1.practice.impl.HotDrinkVM;
import less1.practice.impl.WaterVendingMachine;
import less1.practice.impl.my_HotDrink;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductMain {

    public static void main(String[] args) {
        // Product bottle1 = new BottleOfWater("Родники", 55, LocalDate.of(2024, 5, 1));

        // Product bottle2 = new BottleOfWater("Родники Газированная", 55, LocalDate.of(2024, 5, 1),
        //         true, EPackage.GLASS.getMaterial(), 0.5F);

        // VendingMachine vm = new WaterVendingMachine();

        // VendingMachine vm1 = new HotDrinkVM();

        // System.out.println(vm.getProducts());

        // vm.addProducts(List.of(bottle1, bottle1, bottle1, bottle2, bottle2, bottle2));

        // vm1.addProducts(new ArrayList<>());

        // System.out.println(vm.getProducts());

        // vm.getProduct("Родники");

        // System.out.println(vm.getProducts());

        Product hotDrink1 = new my_HotDrink("Кофе", 100, LocalDate.of(2024, 5, 1), 70, 1);
        Product hotDrink2 = new my_HotDrink("Кофе", 100, LocalDate.of(2024, 5, 1), 70, 2);
        Product hotDrink3 = new my_HotDrink("Чай", 50, LocalDate.of(2024, 5, 1), 90, 1);
        VendingMachine vm1 = new HotDrinkVM();

        System.out.println(vm1.getProducts());

        vm1.addProducts(List.of(hotDrink1, hotDrink2, hotDrink3));

        System.out.println(vm1.getProducts());

        Product takeProduct = vm1.getProduct("Кофе", 1 , 70);

        System.out.println("Я взял этот горячий напиток:");
        System.out.println(takeProduct);






    }
}
