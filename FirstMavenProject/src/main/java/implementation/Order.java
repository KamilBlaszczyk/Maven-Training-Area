package implementation;

import api.IOrder;
import api.IPizza;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Order implements IOrder {

    private IPizza pizza;

    public Order(@Value("#{goodPizza}") IPizza pizza) {
        super();
        this.pizza = pizza;
    }

    public void printOrder(){
        System.out.println("zamowienie: " + pizza.getName() + " Cena: " + pizza.getPrice());
    }

}
