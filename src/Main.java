public class Main {
    public static void main(String[] args) {
        Product p = new Product(1, "laptop", 100000, 10);
        System.out.println(p);
        Cart cart = new Cart();
        cart.addProduct(p);
        cart.printItems();
    }
}
