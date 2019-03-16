package implementation;

import api.ElasticSides;
import api.IOrder;
import api.IShoe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SpecialOrder implements IOrder {

    @Autowired
//    @ElasticSides
    private IShoe shoe;

    public SpecialOrder(){
        super();
    }

    public void printOrder(){
        System.out.println("Zakupiłeś: " + shoe.getName() + "Cena: " + shoe.getPrice());
    }

}
