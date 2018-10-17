import java.util.ArrayList;
public class Flavor {

    private double price;

    private ArrayList<Flower> flowers = new ArrayList<Flower>();

    public double getPrice(){
        return price;
    }

    public Flavor addFlower(Flower flower) {
        flowers.add(flower);
        price += flower.getPrice();
        System.out.println(price);
        return this;
    }

    /*public enum Color{
        Red, Yellow, Green, Blue, Black
    }*/
}
