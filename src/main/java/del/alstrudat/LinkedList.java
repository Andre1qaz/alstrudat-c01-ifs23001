package del.alstrudat;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<T> implements Iterable<T> {

    // For the LinkedListHelper
    Node<T> getHead() {
        return head;
    }

    void setHead(Node<T> head) {
        this.head = head;
    }
}
