package linkedlist;

/**
 * Created by jephy on 2018/3/18.
 * 链表中最重要的几个概念应该就是结点、链头、链尾
 * 链表的一个特点是"传递"。链头由head标记，而链尾的next指向为空。
 * 通过head，以及next是否为空，可以很容易找到链尾。
 *
 * java实现链表的特点是引用当指针用
 */
public class MyLinkedList {

    Node head = null;//链表头的引用

    /**
     * 添加结点
     * 从尾部添加
     * 在可以将链表当作一个整体看待，
     * @param data 数据
     */
    public void addNode(int data){
        Node newNode = new Node(data);//先创建一个链结点
        if (head == null) {//链表为空，即head指向为空的情况下，将新结点作为链表的头结点
            head = newNode;
            return;
        }

        Node tmp = head;
        while (tmp.next != null) {//找到链尾的指针，该指针指向应该为null
            tmp = tmp.next;
        }
        tmp.next = newNode;//让链尾指针指向新创建的结点
    }

    /**
     *
     * @param index 角标
     * @return
     */
    public boolean deleteNode(int index){
        if (index < 1 || index > length()) {
            return false;
        }

        if (index == 1) {//删除的是头结点
            head = head.next;
            return true;
        }

        int i = 1;
        Node preNode = head;
        Node curNode = preNode.next;
        while (curNode != null) {//移动到尾部没找到的话退出循环
            if (i == index) {//循环移动是为了能够让引用指向指定角标的结点
                preNode.next = curNode.next;
                return true;
            }

            //将2个指针整体向后移动指针一次
            preNode = curNode;
            curNode = curNode.next;
            i++;
        }
        return true;
    }

    /**
     * 用一个计数器数结点
     * @return 返回链表的长度
     */
    public int length() {
        int lenght = 0;
        Node tmp = head;
        while (tmp != null) {
            lenght++;
            tmp = tmp.next;
        }
        return lenght;
    }

    /**
     * 对链表进行排序，返回排序后的头结点
     * @return
     */
    public Node orderList(){
        Node nextNode = null;
        int temp = 0;
        Node curNode = head;
        while (curNode.next != null) {
            nextNode = curNode.next;
            while (nextNode != null) {
                if (curNode.data > nextNode.data) {
                    temp = curNode.data;
                    curNode.data = nextNode.data;
                    nextNode.data = temp;
                }
                nextNode = nextNode.next;
            }
            curNode = curNode.next;
        }
        return head;
    }

    public void printList(){
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }

}
