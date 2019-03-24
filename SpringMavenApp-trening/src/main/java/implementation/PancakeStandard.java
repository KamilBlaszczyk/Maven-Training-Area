package implementation;

import api.IPancake;
import api.PancakeBrownie;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@PancakeBrownie
public class PancakeStandard implements IPancake {

    private int price;
    private String name;

    public PancakeStandard(@Value("#{pancakeBrownie.price > 13 ? 13 : 20}") int price, @Value("#{pancakeBrownie.getName()?.toUpperCase()}") String name) {
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
