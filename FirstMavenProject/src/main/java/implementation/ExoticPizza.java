package implementation;

import api.GoodPizza;
import api.IPizza;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@GoodPizza
//@Qualifier("exotic")
public class ExoticPizza implements IPizza {

    private int price;
    private String name;

    @Value("#{goodPizza.price matches '[1-9][1-9]'}")
    boolean bool;

    public ExoticPizza(@Value("#{goodPizza.price > 13 ? 13 : 20}") int price, @Value("#{goodPizza.getName()?.toUpperCase()}") String name) {
        super();
        this.price = price;
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getPrice() {
        System.out.println(bool);
        return price;
    }

    @Override
    public String getName() {
        return name;
    }











//        SpEL
//        @Value("#{goodPizza.getPrice()}")
//        @Value("#{goodPizza.getName()?.toUpperCase()}")
//        @Value("#{T(java.lang.Math).random()*10}")
//        @Value("#{ goodPizza.price <13 ? 13 : 20}")





}
