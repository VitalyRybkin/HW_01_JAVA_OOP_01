public class Product {
    private final String name;
    private final double price;
    private int counter;

    public Product(String name, double price, int value) {
        this.name = name;
        this.price = price;
        counter = value;
    }

    public String getName() {
        return name;
    }

    public boolean sellCounter() {
        this.counter--;
        return counter > 0;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f р.", name, price);
    }
}
