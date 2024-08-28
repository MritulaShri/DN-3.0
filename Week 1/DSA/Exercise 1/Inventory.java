import java.util.HashMap;

public class Inventory {
    private HashMap<String, Product> products;

    public Inventory() {
        this.products = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    public void updateProduct(String productId, Product newProduct) {
        if (products.containsKey(productId)) {
            products.put(productId, newProduct);
        }
    }

    public void deleteProduct(String productId) {
        products.remove(productId);
    }
}
