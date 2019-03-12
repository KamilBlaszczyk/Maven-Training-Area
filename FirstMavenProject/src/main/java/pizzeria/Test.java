package pizzeria;

import api.IOrder;
import implementation.Order;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String []args){
        AnnotationConfigApplicationContext context  = new AnnotationConfigApplicationContext(Config.class);
        IOrder order = context.getBean(Order.class);
        order.printOrder();
    }

}
