/**
 * Item on the Wish List
 * @author Sophie Crane
 */
public class Item {
    private String title;
    private String description;
    private double price;

    /**
     * Item that will be on the Wish List
     * @param title The title of the item 
     * @param description The description of the item
     * @param price The price of the item
     */
    public Item(String title, String description, double price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    /**
     * Returns the information about the item as a String
     * @return A string version of the information about the item
     */
    public String toString() {
        return "*****" + title + "*****" + "\n" + description + "\nPrice: $" + price + "\n";
    }

    /**
     * Returns the price of the item
     * @return The price of the item 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Prints out the information
     */
    public void print() {
        System.out.println(this.toString());
    }
}

