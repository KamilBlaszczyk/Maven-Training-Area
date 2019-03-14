package shoemaker;

import api.IOrder;
import config.AutoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Run {
    public static void main(String []args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);
        IOrder order = context.getBean(IOrder.class);
        order.printOrder();
    }
}
