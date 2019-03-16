package implementation;

import api.ElasticSides;
import api.IShoe;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Oxfords implements IShoe {

    private  int price;
    private String name;

    public Oxfords(@Value("oxfordy") String name, @Value("250") int price) {
        super();
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
