/**
 * The Wish List of items
 * @author Sophie Crane
 */
public class WishList {
    static final int MAX_ITEMS = 5;
    private String name;
    private Item[] items;
    private int count = 0;

    /**
     * The Wish List
     * @param name The name of the item
     */
    public WishList(String name) {
        items = new Item[MAX_ITEMS];
        this.name = name;
    }

    /**
     * Adds an item to the Wish List
     * @param title Title of the item 
     * @param description Description of the item
     * @param price Price of the item
     */
    public void addItem(String title, String description, double price) {
        Item item = new Item(title, description, price);
        if(count >= MAX_ITEMS) {
            growArray(items);
        }
        else {
            items[count] = item;
            count += 1;
        }

    }

    /**
     * Creates an iterator to iterate through the Wish List
     * @return A Wish List Iterator to iterate through the Wish List
     */
    public WishListIterator createIterator() {
        return new WishListIterator(items);
    }

    /**
     * Calculates the total cost of the wish list 
     * @return The total cost of all the items on the Wish List
     */
    public double getTotalCost() {
        double totalCost = 0.0;
        for(int i = 0; i < count; i++) {
            totalCost += items[i].getPrice();
        }
        return totalCost;
    }

    /**
     * Grows the array to double the original size
     * @return A new array that is double the size of the original
     */
    private Item[] growArray(Item[] items) {
        Item[] newItem = new Item[items.length * 2];
        for(int i = 0; i < items.length; i++) {
            newItem[i] = items[i];
        }
        return newItem;
    }
}

