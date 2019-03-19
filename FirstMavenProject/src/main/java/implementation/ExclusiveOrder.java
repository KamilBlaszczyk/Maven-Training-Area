package implementation;

import api.GoodPizza;
import api.IOrder;
import api.IPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Primary
public class ExclusiveOrder implements IOrder {

//    @Autowired //Wstrzykiwanie przez Refleksje
//    @GoodPizza

    @Value("#{listOfPizza[1]}")
    private IPizza pizza;
    @Autowired
    private List<IPizza> listOfPizza;

    public ExclusiveOrder() {
        super();
    }

    public void printOrder(){
        System.out.println("zamowienie exclusive: " + pizza.getName() + " Cena: " + pizza.getPrice());
    }

    public IPizza getPizza() {
        return pizza;
    }

//    @Value("#{exoticPizza}")   //SpEL used inject be default ID class
    public void setPizza(IPizza pizza) {
        this.pizza = pizza;
    }
}
