package implementation;

import api.IOrder;
import api.IPancake;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Order implements IOrder {

    private IPancake pancake;

    public Order(@Value("#{pancakeBrownie}") IPancake pancake) {
        super();
        this.pancake = pancake;
    }

    @Override
    public void printOrder() {
        System.out.println("Name of your pancake is: " + pancake.getName() +
                "Price is: " + pancake.getPrice());
    }
}
