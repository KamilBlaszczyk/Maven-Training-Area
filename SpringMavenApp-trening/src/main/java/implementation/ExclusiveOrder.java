package implementation;

import api.IOrder;
import api.IPancake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Primary
public class ExclusiveOrder implements IOrder {

    @Value("#{listOfPancake[1]}")
    private IPancake pancake;
    @Autowired
    private List<IPancake> listOfPancake;

    public ExclusiveOrder() {
        super();
    }

    public void printOrder(){
        System.out.println("zamowienie exclusive: " + pancake.getName() + " Cena: " + pancake.getPrice());
    }

    public IPancake getPancake() {
        return pancake;
    }

    public void setPancake(IPancake pancake) {
        this.pancake = pancake;
    }

}
