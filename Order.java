package 제품관리;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Order {
    private final ArrayList<Product> products;
    private BigDecimal total;

    public Order() {
        products = new ArrayList<>();
        total = BigDecimal.ZERO;
    }

    public void addItem(Product product) {
        products.add(product);
        total = total.add(product.getPrice()); // 객체 타입으므로..
    }

    public Product getItem(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public boolean removeItem(String name) {
        for (Product product: products) {
            if (product.getName().equals(name)) {
                products.remove(product);
                total = total.subtract(product.getPrice());
                return true;
            }
        }
        return false;
    }

    public BigDecimal calculateFinalPrice(BigDecimal taxRate) {
        BigDecimal taxAmount = total.multiply(taxRate); // 주문 금액에 세율을 곱해 세금 금액을 계산
        BigDecimal finalPrice = total.add(taxAmount);
        return finalPrice.setScale(2, RoundingMode.HALF_UP);
    }
}
