public class Main {
    public static void main(String[] args) {
        VendingMachine mart = new VendingMachine();
        mart.addProduct(new Product("Хлеб", 35, 10))
                .addProduct(new Milk("Пармалат", 50, 2))
                .addProduct(new Product("Сыр", 100.2, 5))
                .addProduct(new ConcentrateMilk("Советская", 150, 1))
                .addProduct(new Chocolate("Аленка", 35.20,3, "\"Орех\""))
                .addProduct(new Capuchino("Капучино", 150, 115))
                .addProduct(new Juice("Яблочный", 113, 25))
                .addProduct(new Juice("Апельсиновый", 120, 13));

        System.out.println("Список товаров: ");
        System.out.println(mart);
    }

    public static void PrintSell (VendingMachine machine, String nameProd){
        try{
            System.out.println(machine.sell(nameProd));
        } catch (Exception e) {
            System.out.println("Товар не найден");
        }
    }
}
