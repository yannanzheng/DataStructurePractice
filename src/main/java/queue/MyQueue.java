package queue;

import java.util.LinkedList;

/**
 * Created by jephy on 2018/3/19.
 * 采用数组实现队列
 * 为了实现多线程安全，增加了对队列操作的同步
 */
public class MyQueue<E> {
    private LinkedList<E> list = new LinkedList<>();
    private int size = 0;

    public synchronized void put(E e) {
        list.addLast(e);
        size++;
    }
    public synchronized E pop(){
        size--;
        return list.removeFirst();
    }

    public synchronized boolean empty(){
        return size == 0;
    }

    public synchronized int size(){
        return size;
    }
}
