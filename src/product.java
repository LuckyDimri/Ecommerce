public class Product {
    private int id;
    private String name;
    private double price;
    private int stock;

    public Product(int id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    public int getId() {  return id; }
    public String getName() {  return name; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }

    @Override
    public String toString(){
        return ("product ID: " + id + " name: " + name + " price: " + price + " stock: " + stock);
    }
}
