package implementation;

import api.GoodPizza;
import api.IPizza;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component
@GoodPizza
//@Qualifier("salami")
public class SalamiPizza implements IPizza {

    private int price;
    private String name;

    public SalamiPizza(@Value("20") int price, @Value("Salami") String name) {
        super();
        this.price = price;
        this.name = name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}
