package linkedlist;

/**
 * This class models a linked list in which each node has a pointer to the node after it,
 * except the tail which does not have a node after.
 * 
 * @param <T> The type of data that this linked list holds.
 * @author
 * Programming Project 1 Start Project
 * CS131ON
 */
public class GenericLinkedList<T> {
    
    private GenericNode<T> head; // node to represent the head of the list
    private GenericNode<T> tail; // node to represent the tail (end) of the list
    private int length; // variable to keep track of the number of elements in the list

    /**
     * The constructor for this object initializes the list as empty (no head or tail node).
     */
    public GenericLinkedList() {
        head = null;
        length = 0;
        tail = head;
    }

    /**
     * Method to see if there are any elements in the list.
     * 
     * @return True if the list is empty, false otherwise.
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * This method returns the head node of the list from which you can traverse
     * the entire list by following node links.
     * 
     * @return The head node of the list.
     */
    public GenericNode<T> getList() {
        return head;
    }

    /**
     * This method adds a new node to the list.
     * 
     * @param aNode The node to add.
     */
    public void addNode(GenericNode<T> aNode) {
        if (isEmpty()) {
            head = aNode;
            tail = head;
            return;
        }

        tail.setNextNode(aNode);
        tail = tail.getNextNode();
        tail.setNextNode(null);
        length++;
    }
}

