package queueimplementedwithlinkedlist;

/**
 * Created by jephy on 2018/3/19.
 */
public class MyQueue<E>{
    private Node<E> head = null;
    private Node<E> tail = null;
    public boolean isEmpty(){
        return head == tail;
    }

    public void put(E data){
        Node<E> newNode = new Node<E>(data);
        if (head == null && tail == null) {//队列为空
            head = tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public E pop(){
        if (this.isEmpty()) {
            return null;
        }
        E data = head.data;
        head = head.next;
        return data;
    }

    public int size(){
        Node<E> tmp = head;
        int n = 0;
        while (tmp != null) {
            n++;
            tmp = tmp.next;
        }

        return n;
    }

    public static void main(String[] args){
        MyQueue<Integer> q = new MyQueue<>();
        q.put(1);
        q.put(2);
        q.put(3);
        q.put(4);
        System.out.println("队列长度为：" + q.size());
        System.out.println("队首元素为："+q.pop());
        System.out.println("队首元素为："+q.pop());
    }
}
