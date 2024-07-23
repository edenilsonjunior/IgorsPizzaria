package model;

import java.util.ArrayList;
import java.util.List;

public final class Pizza {

    private final SizeType size;
    private final CrustType crust;
    private final String cheese;
    private final List<String> toppings;

    private Pizza(SizeType size, CrustType crust, String cheese, List<String> toppings){

        this.size = size;
        this.crust = crust;
        this.cheese = cheese;
        this.toppings = new ArrayList<>(toppings);
    }

    public SizeType getSize() {
        return size;
    }

    public CrustType getCrust() {
        return crust;
    }

    public String getCheese() {
        return cheese;
    }

    public List<String> getToppings() {
        return new ArrayList<>(toppings);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Pizza: \n");
        sb.append("Size: " + size.toString() + "\n");
        sb.append("Crust: " + crust.toString() + "\n");
        sb.append("Cheese: " + cheese + "\n");
        sb.append("Toopings: " + toppings.toString() + "\n");

        return sb.toString();
    }

    public static class Builder{

        private SizeType size;
        private CrustType crust;
        private String cheese;
        private List<String> toppings;

        public Builder(){

            size = SizeType.DEFAULT;
            crust = CrustType.THIN;
            cheese = "mussarela";
            toppings = new ArrayList<>();
        }

        public Builder crust(CrustType crust){

            this.crust = crust;
            return this;
        }

        public Builder size(SizeType size){

            this.size = size;
            return this;
        }

        public Builder cheese(String cheese){

            this.cheese = cheese;
            return this;
        }

        public Builder addTopping(String topping){

            this.toppings.add(topping);
            return this;
        }

        public Pizza build(){
            return new Pizza(size, crust, cheese, toppings);
        }
    }
}
