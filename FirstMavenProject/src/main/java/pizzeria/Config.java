package pizzeria;

import api.IOrder;
import api.IPizza;
import implementation.GoodPizza;
import implementation.Order;
import implementation.SalamiPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public IPizza pizza(){
        return new SalamiPizza(20, "tasty");
    }

    @Bean(name = "inna")
    public IOrder order(IPizza pizza){
        return new Order(pizza);
    }
}
