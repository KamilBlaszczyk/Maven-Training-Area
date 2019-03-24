package implementation;

import api.IPancake;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@PropertySource("classpath:prices.properties")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PancakeBrownie implements IPancake {

    private int price;
    private String name;

    public PancakeBrownie(@Value("${price}") int price, @Value("${name}") String name){
        super();
        this.price = price;
        this.name = name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
