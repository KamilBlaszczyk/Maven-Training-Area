package implementation;

import api.IPancake;

public class PancakeBrownie implements IPancake {

    private int price;
    private String name;

    public PancakeBrownie(int price, String name){
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
