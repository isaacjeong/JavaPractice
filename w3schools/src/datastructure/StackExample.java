package datastructure;

import java.util.ArrayList;

class Stk {
    ArrayList<String> list = new ArrayList<String>();
    public void push(String arg){
        this.list.add(arg);
    }
    public String pop() {
        String firstElement = this.list.get(this.list.size() -1);
        this.list.remove(this.list.size() -1);
        return firstElement;
    }
}
public class StackExample {
    public static void main(String[] args) {
        Stk stack = new Stk();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.list.get(stack.list.size() - 1));
    }
}
