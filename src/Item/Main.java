package Item;

import java.security.Key;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<Product,Price> map=new HashMap<>();
        Product car = new Product("Car",
                new Price(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));
        Product moto = new Product("Motorcycle",
                new Price(10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120));
        Product truck = new Product("Truck",
                new Price(112, 222, 2223, 1123, 1323, 1232, 31231, 123, 123, 123, 12, 123));
        Product train = new Product("Train",
                new Price(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));
        map.put(car,car.getPrice());
        map.put(moto,moto.getPrice());
        map.put(truck,truck.getPrice());
        map.put(train,train.getPrice());
        Main m = new Main();
        m.getProduct(map);
    }
    public Integer getProduct(HashMap<Product,Price> map) {
        return map.keySet().iterator().next().getPrice().getAug(); //here we can change months to show price in different season;
    }

}
