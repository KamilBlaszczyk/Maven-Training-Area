package implementation;

import api.IOrder;
import api.IPizza;
import org.springframework.stereotype.Component;

@Component
public class Order implements IOrder {

    private IPizza pizza;

    public Order(IPizza pizza) { //@Qualifier("dobra")
        super();
        this.pizza = pizza;
    }

    public void printOrder(){
        System.out.println("zamowienie: " + pizza.getName() + " Cena: " + pizza.getPrice());
    }

}
