package implementation;

import api.ElasticSides;
import api.IOrder;
import api.IShoe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order implements IOrder {

    private IShoe shoe;

    public Order(IShoe shoe){
        super();
        this.shoe = shoe;
    }

    @Autowired
    @ElasticSides
    public void printOrder(){
        System.out.println("Zakupiłeś: " + shoe.getName() + "Cena: " + shoe.getPrice());
    }

}
