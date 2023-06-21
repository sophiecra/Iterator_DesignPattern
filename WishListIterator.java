/**
 * An iterator that iterates through the Wish List
 * @author Sophie Crane
 */
public class WishListIterator implements Iterator {
    private Item[] items;
    private int position = 0;

    /**
     * An iterator that iterates through the Wish List
     * @param items An array of the items on the Wish List
     */
    public WishListIterator(Item[] items) {
        this.items = items;
    }

    /**
     * Checks if there is an item next on the list, or if it is at the end of the list
     * @return A boolean that determines whether there is an item next on the list for the iterator to move on to 
     */
    public boolean hasNext() {
        if(position >= items.length || items[position] == null) {
            return false;
        }
        else {
            return true;
        }
    }

    /**
     * Moves the iterator onto the next object on the Wish List
     * @return The next object on the Wish List
     */
    public Item next() {
        Item item = items[position];
        position += 1;
        return item;
    }
}

