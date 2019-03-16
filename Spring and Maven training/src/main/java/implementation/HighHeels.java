package implementation;

import api.ElasticSides;
import api.IShoe;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@ElasticSides
@Primary
public class HighHeels implements IShoe {

    private int price;
    private String name;

    public HighHeels(@Value("Szpilki") String name,@Value("99") int price) {
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

