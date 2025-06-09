package Task1;

/**
 * ListMusicBand is a concrete implementation of the AbstractMusicBand class,
 * which stores tours using a singly linked list structure.
 *
 * <p>This class provides methods to add and retrieve tours using an internal
 * linked list implementation.</p>
 */
public class ListMusicBand extends AbstractMusicBand{
    /**
     * Private inner class representing a node in the linked list.
     */
    private class Node {
        Tour tour;
        Node next;

        /**
         * Constructs a Node with the given Tour.
         *
         * @param tour the tour to store in this node
         */
        Node(Tour tour) { this.tour = tour; this.next = null; }
    }

    private int size = 0;
    private Node head = null;

    /**
     * Constructs a ListMusicBand with the specified name and leader.
     *
     * @param name   the name of the band
     * @param leader the leader of the band
     */
    ListMusicBand(String name, String leader) {
        super(name, leader);
    }

    /**
     * Returns the tour at the specified index.
     *
     * @param index the index of the tour to retrieve
     * @return the Tour object at the given index, or null if the index is invalid
     */
    @Override
    public Tour getTour(int index) {
        if (index < 0 || index >= this.size) return null;
        Node node = this.head;
        for (int i = 0; i < index; i++) node = node.next;
        return node.tour;
    }

    /**
     * Returns the total number of tours in the list.
     *
     * @return the number of tours
     */
    @Override
    public int getTourLength() {
        return size;
    }

    /**
     * Adds a new Tour to the end of the band's tour list.
     *
     * @param t the Tour object to be added
     */
    public void addTour(Tour t) {
        if (this.head == null) this.head = new Node(t);
        else {
            Node node = this.head;
            while (node.next != null) node = node.next;
            node.next = new Node(t);
        }
        this.size++;
    }
}
