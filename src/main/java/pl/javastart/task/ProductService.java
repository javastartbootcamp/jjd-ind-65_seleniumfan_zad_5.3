package pl.javastart.task;

public class ProductService {
    double getGrossPrice(Product product) {
        return switch (product.getCategory()) {
            case "Food" -> computeGrossPrice(product.getNetPrice(), 0.12);
            case "Electronics" -> computeGrossPrice(product.getNetPrice(), 0.05);
            default -> computeGrossPrice(product.getNetPrice(), 0.23);
        };
    }

    private double computeGrossPrice(double price, double rate) {
        return price + price * rate;
    }
}
