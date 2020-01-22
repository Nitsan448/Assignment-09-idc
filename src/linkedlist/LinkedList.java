package linkedlist;

/**
 * Represents a list of Nodes. 
 */
public class LinkedList<T> {
	
	private Node<T> first = null; // pointer to the first (dummy) node of this list
	private Node<T> last = null;  //  pointer to the last node of this list
	private int size = 0;         // number of elements in this list */
	
	/**
	 * Constructs a new list.
	 */ 
	public LinkedList () {
		// replace this comment with your code
	}
	
	
	/**
	 * Creates a new Node object that points to the given object, 
	 * and inserts the node at the given index in this list.
	 * <p>
	 * If the given index is 0, the new node becomes the first node in this list.
	 * <p>
	 * If the given index equals the list's size, the new node becomes the last 
	 * node in this list. 
	 * 
	 * @param insert
	 *        the object to be inserted into the list
	 * @param index
	 *        the index before which the object should be inserted
	 * @throws IllegalArgumentException
	 *         if index is negative or greater than the list's size
	 */
	public void add(int index, T insert) {
		// replace this comment with your code
	}


	
	/**
	 * Creates a new node with a reference to the given object, and appends it
	 * to the end of this list(the node will become the list's last node).
	 * The running time of this method must be O(1).
	 * 
	 * @param insert
	 *        the given object
	 */
	public void addLast(T insert) {
		// replace this comment with your code
	}

	/**
	 * Creates a new node with a reference to the given object, and inserts it
	 * at the beginning of this list (the node will become the list's first node).
	 * The running time of this method must be O(1).
	 * 
	 * @param insert
	 *        the given object
	 */
	// */he given object
	public void addFirst(T insert) {
		// replace this comment with your code
	}

	/**
	 * Gets the object located at the given index in this list.
	 * 
	 * @param index
	 *        the index of the retrieved object
	 * @return the object at the given index
	 * @throws IllegalArgumentException
	 *         if index is negative or greater than or equal to size
	 */
	public T get(int index) {
		// replace this comment with your code
		return null;
	}	

	/**
	 * Gets the index of the node pointing to the given object.
	 * 
	 * @param t
	 *        the given object
	 * @return the index of the first occurrence of the object, or -1 if the object is not in this list
	 */
	public int indexOf(T t) {
		// replace this comment with your code
		return 0;
	}



	/**
	 * Removes from this list the first occurrence of a node pointing to the given object.
	 * 
	 * @param remove the object that should be removed from the list
	 * @throws IllegalArgumentException
	 *         if the given memory block is not in this list
	 */
	public void remove(T remove) {
		// replace this comment with your code
	}	

	/**
	 * Returns an iterator over this list, starting with the first element.
	 */
	public LinkedListIterator<T> iterator(){
		return new LinkedListIterator<T>(first.next);
	}
	
	/**
	 * A textual representation of this list, useful for debugging.
	 */
	public String toString() {
		// replace this comment with your code
		return null;
	}
}