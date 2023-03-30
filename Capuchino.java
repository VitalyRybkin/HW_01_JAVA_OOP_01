public class Capuchino extends Product {
    public Capuchino(String name, double price, int value) {
        super(name, price, value);
    }

    @Override
    public String toString() {
        return String.format("%s" ,super.toString());
    }
}
