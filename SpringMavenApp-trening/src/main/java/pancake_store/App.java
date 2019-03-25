package pancake_store;

import api.IOrder;
import config.AutoConfig;
import implementation.Order;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Blaszczyk Kamil
 *
 */

public class App {
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);

        IOrder order = context.getBean(IOrder.class);
        IOrder order2 = context.getBean(Order.class);

        order.printOrder();
        order2.printOrder();

    }
}
