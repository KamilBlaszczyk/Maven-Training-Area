package implementation;

import api.IPizza;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("dobra")
@Primary
public class GoodPizza implements IPizza {

    private int price;
    private String name;

    public GoodPizza(@Value("10") int price, @Value("good") String name) {
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
