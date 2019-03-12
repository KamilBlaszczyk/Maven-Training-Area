package implementation;

import api.IPizza;

public class SalamiPizza implements IPizza {

    private int price;
    private String name;

    public SalamiPizza(int price, String name) {
        super();
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
