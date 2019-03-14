package implementation;

import api.IShoe;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("elastic")
@Primary
public class ElasticSides implements IShoe {

    private int price;
    private String name;

    public ElasticSides(@Value("sztyblety") String name,@Value("150") int price) {
        super();
        this.name = name;
        this.price = price;
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
