package less1.practice;

import java.util.ArrayList;
import java.util.List;

import less1.practice.impl.my_HotDrink;

public abstract class VendingMachine {

    protected List<Product> products;

    public VendingMachine() {
        this.products = new ArrayList<>();
    }

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public abstract void addProducts (List<Product> products);

    public Product getProduct(String name) {

//        products.stream().filter(product -> product.getName().equals(name)).findFirst().orElse(null);

        for (Product product : products) {
            if (product.getName().equals(name)) {
                products.remove(product);
                return product;
            }
        }

        System.out.println("No such product: " + name);
        return null;
    }

    public Product getProduct(String name, int volume, int temperature) {
        for (Product product : products) {
            if (product instanceof my_HotDrink) {
                my_HotDrink hotDrink = (my_HotDrink) product;
                if (hotDrink.getName().equals(name) && hotDrink.getVolume() == volume && hotDrink.getTemperature() == temperature) {
                    products.remove(hotDrink);
                    return hotDrink;
                }
            }
        }
        return null; 
    }



//    public Product getProduct(String name) {
//
//        for (Product product : products) {
//            if (product.getName().equals(name)) {
//                products.remove(product);
//                return product;
//            }
//        }
//
//        throw new RuntimeException("No such product: " + name);
//    }

    public List<Product> getProducts() {
        return products;
    }
}
