package implementation;

import api.IOrder;
import api.IPizza;

public class Order implements IOrder {

    private IPizza pizza;

    public Order(IPizza pizza) {
        super();
        this.pizza = pizza;
    }

    public void printOrder(){
        System.out.println("zamowienie:" + pizza.getName() + " Cena: " + pizza.getPrice());
    }
}
