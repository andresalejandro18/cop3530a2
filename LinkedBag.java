
/**
 * The class LinkedBag implements a multiset of strings with a linked list.
 * The linked list uses a header (dummy) node and a pointer to the last node.
 *
 * @author add here name, Panther ID, and class section of all authors
 */
public class LinkedBag
{

    private Node first; //points to the first node of the linked list (dummy node)
    private Node last;  //points to the last node of the linked list
    private int length; //number of elements (it's equal to the number of nodes - 1)

    /**
     * Default constructor. Sets this object as an empty bag. The method takes
     * O(1) time.
     *
     */
    public LinkedBag()
    {
        first = new Node("DUMMY", null);
        last = first;
        length = 0;
    }

    /**
     * Adds new element to the back end of the bag. The method takes O(1) time.
     *
     * @param s new element to be added to the LinkedBag.
     */
    public void add(String s)
    {
        //TO IMPLEMENT
    }

    /**
     * Determines the number of occurrences in the bag of a given element. The
     * method takes O(n) time.
     *
     * @param s given element
     * @return number of times the given element occurs in the LinkedBag.
     */
    public int count(String s)
    {
        //TO IMPLEMENT
    }

    /**
     * Returns number of elements in the bag. The method takes O(1) time.
     *
     * @return number of elements
     */
    public int getNumberOfItems()
    {
        //TO IMPLEMENT
    }
    /**
     * Determines if this bag is empty. The method takes O(1) time.
     *
     * @return true if LinkedBag contains no elements, false otherwise.
     */
    public boolean isEmpty()
    {
        //TO IMPLEMENT
    }

    /**
     * Removes one occurrence of a given element. The method should remove from
     * the linked list the first occurrence of the element, if it were present
     * in the linked list more than once. It takes O(n) time.
     *
     * @param s element to be removed.
     */
    public void remove(String s)
    {
        //TO IMPLEMENT
    }

    /**
     * Builds a String description of this bag.
     *
     * @return String containing the bag elements.
     */
    public String toString()
    {
        String str = "";

        Node current = first.getNext();
        for (int i = 0; i < length - 1; i++)
        {
            str += current.getInfo() + ", ";
            current = current.getNext();
        }

        if (length != 0)
            return "Bag: {" + str + last.getInfo() + "}";
        else
            return "Bag: {}";
    }
}
