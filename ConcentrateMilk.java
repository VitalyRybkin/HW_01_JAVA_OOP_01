public class ConcentrateMilk extends Milk {

    public ConcentrateMilk(String name, double price, int value) {
        super(name, price, value);
    }

    @Override
    public String toString() {
        return "Сгущенка: " +
                super.toString();
    }
}
