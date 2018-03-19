package queueimplementedwithlinkedlist;

/**
 * Created by jephy on 2018/3/19.
 */
public class Node<E> {
    Node<E> next = null;
    E data;

    public Node(E data) {
        this.data = data;
    }
}
