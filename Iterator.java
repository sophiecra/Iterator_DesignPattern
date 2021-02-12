/**
 * Used to iterate over the Wish List
 * @author Sophie Crane
 */
public interface Iterator {
    /**
     * Checks if there is an item next on the list, or if it is at the end of the list
     * @return A boolean that determines whether there is an item next on the list for the iterator to move on to 
     */
    public boolean hasNext();

    /**
     * Moves the iterator onto the next object on the Wish List
     * @return The next object on the Wish List
     */
    public Object next();
 }
