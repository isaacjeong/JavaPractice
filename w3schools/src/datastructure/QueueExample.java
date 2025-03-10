package datastructure;

import java.util.ArrayList;

class Que {
    ArrayList<String> list = new ArrayList<String>();
    public void push(String arg) {
        this.list.add(arg);
    }
    public String pop() {
        String firstElement = this.list.get(0);
        // get rid of first element in the this.list
        this.list.remove(0);
        return firstElement;
    }
}
public class QueueExample {
    public static void main(String[] args) {
        Que q = new Que();
        q.push("A");
        q.push("B");
        q.push("C");
        q.push("D");
        q.push("E");
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
//        System.out.println(q.list.get(1));
//        System.out.println(q.list.get(4));

        System.out.println(q.list.get(0));
    }
}
