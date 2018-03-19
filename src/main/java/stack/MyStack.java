package stack;

import java.util.Arrays;

/**
 * Created by jephy on 2018/3/19.
 */
public class MyStack <E>{
    private Object[] stack;
    private int size;//数组中存储元素的个数

    public MyStack() {
        stack = new Object[10];
    }

    //判断堆栈是否为空
    public boolean isEmpty(){
        return size == 0;
    }

    public E peek(){
        if (isEmpty()) {
            return null;
        }

        return (E) stack[size - 1];
    }

    public E pop(){
        E e = peek();
        stack[size-1] = null;
        size--;
        return e;
    }

    public E push(E item){
        ensureCapacity(size +1);//检查容量
        stack[size++] = item;
        return item;
    }

    /**
     * 判断数组容器是否已经满了，若已满，则扩充数组空间
     * @param size
     */
    private void ensureCapacity(int size) {
        if (size > stack.length) {
            int newLen = stack.length + 10;
            stack = Arrays.copyOf(stack, newLen);
            System.out.println("ensureCapacity,stack.lenght = "+stack.length);
        }
    }

    public static void main(String[] args){
        MyStack<Integer> s = new MyStack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);
        s.push(10);
        s.push(11);

        System.out.println("栈中元素个数：" + s.size);
        System.out.println("栈顶元素为：" + s.pop());
        System.out.println("栈顶元素为："+s.pop());

    }

}
