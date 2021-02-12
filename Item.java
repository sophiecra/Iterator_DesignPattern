
public class Item {
    private String title;
    private String description;
    private double price;

    public Item(String title, String description, double price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public String toString() {
        return "Title: " + title + "\nDescription: " + description + "\nPrice: " + price + "\n";
    }

    public double getPrice() {
        return price;
    }

    public void print() {
        System.out.println(this.toString());
    }
}

