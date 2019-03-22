package implementation;

import api.IOrder;
import api.IPancake;

public class Order implements IOrder {

    private IPancake pancake;

    public Order(IPancake pancake) {
        super();
        this.pancake = pancake;
    }

    @Override
    public void printOrder() {
        System.out.println("Name of your pancake is: " + pancake.getName() +
                "Price is: " + pancake.getPrice());
    }
}
