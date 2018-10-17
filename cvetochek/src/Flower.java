public class Flower {

    private double price;
    private String name;
    private Colors color;

    public Flower(double price, String name, Colors color) {

        //добавить условие, при котором типы дабл, стринг и колорс не будут равны 0 и налл

        if (price < 0) {
            throw new IllegalArgumentException("Цена не может быть ниже 0");
        }
        this.price = price;
        if (name == null) {
            throw new IllegalArgumentException("Название аргумента не может быть 0");
        }
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Название цветочка не может быть 0");
        }
        this.name = name;
        if (color == null) {
            throw new IllegalArgumentException("Название цвета не может быть 0");
        }
        this.color = color;
    }


    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Colors getColor() {
        return color;
    }
}




