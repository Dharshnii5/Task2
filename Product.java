import java.math.BigDecimal;
//using BigDecimal method instead of double method
import java.util.Scanner;

class Product {
    private int pid;
    private BigDecimal price;
    private int quantity;

    public Product(int pid, BigDecimal price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


// Getters and setters for the attributes

}

class XYZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int numProducts = scanner.nextInt();

        Product[] products = new Product[numProducts]; // Array to store product objects

        // Input for 5 products
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Product " + (i + 1));
            System.out.print("PID: ");
            int pid = scanner.nextInt();
            System.out.print("Price: ");
            BigDecimal price = scanner.nextBigDecimal();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            products[i] = new Product(pid, price, quantity);
        }

        // Find product with high price

        Product maxProduct = products[0];
        for (int i = 1; i < products.length; i++) {
            if (products[i].getPrice().compareTo(maxProduct.getPrice()) > 0) {
                maxProduct = products[i];
            }

        }
            System.out.println("Product with the highest price:");
            System.out.println("PID: " + maxProduct.getPid());
            System.out.println("Price: " + maxProduct.getPrice());


        // Calculate total amount spent
        BigDecimal totalAmount = BigDecimal.ZERO;
        for (Product product : products) {
            totalAmount = totalAmount.add(product.getPrice().multiply(BigDecimal.valueOf(product.getQuantity())));

        }
            System.out.println("Total amount spent on all products: " + totalAmount);

    }
}
