package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("Butter", "Peanut butter", 5.0, "Food");
        Product product2 = new Product("Laptop", "Dell XPS 9520", 12_999.0, "Electronics");

        ProductService productService = new ProductService();
        double grossPrice1 = productService.getGrossPrice(product1);
        System.out.println(product1 + ", gross price: " + grossPrice1 + " zł");

        double grossPrice2 = productService.getGrossPrice(product2);
        System.out.println(product2 + ", gross price: " + grossPrice2 + " zł");
    }
}
