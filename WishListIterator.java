public class WishListIterator {
    private Item[] items;
    private int position = 0;

    public WishListIterator(Item[] items) {
        this.items = items;
    }

    public boolean hasNext() {
        if(position >= items.length || items[position] == null) {
            return false;
        }
        else {
            return true;
        }
    }

    public Item next() {
        Item item = items[position];
        position += 1;
        return item;
    }
}

