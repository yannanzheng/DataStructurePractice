package linkedlist;

/**
 * Created by jephy on 2018/3/18.
 */
public class MyLinkedList {

    Node head = null;//链表头的引用

    public void addNode(int d){
        Node newNode = new Node(d);
        if (head == null) {
            head = newNode;
            return;
        }

        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = newNode;
    }

    public Boolean deleteNode(int index){
        if (index<1||index>length()) {
            return false;
        }

        if (index == 1) {
            head = head.next;
            return true;
        }

        int i = 1;
        Node preNode = head;
        Node curNode = preNode.next;
        while (curNode != null) {
            if (i == index) {
                preNode.next = curNode.next;
                return true;
            }
            preNode = curNode;
            curNode = curNode.next;
            i++;
        }
        return true;
    }

    public int length() {
        int lenght = 0;
        Node tmp = head;
        while (tmp != null) {
            lenght++;
            tmp = tmp.next;
        }
        return lenght;
    }

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
