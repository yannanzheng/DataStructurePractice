package stackimplementwithlinkedlist;

/**
 * Created by jephy on 2018/3/19.
 */
public class Stack<E> {
    Node<E> top = null;

    public boolean isEmpty(){
        return top == null;
    }

    public void push(E data) {
        Node<E> newNode = new Node<E>(data);
        newNode.next = top;
        top = newNode;
    }

    public E pop(){
        if (this.isEmpty()) {
            return null;
        }

        E data = top.data;
        top = top.next;
        return data;
    }

    public E peek(){
        if (isEmpty()) {
            return null;
        }

        return top.data;
    }

    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println("stack.pop() = "+stack.pop());
        System.out.println("stack.pop() = "+stack.pop());
        System.out.println("stack.pop() = "+stack.pop());
    }
}
