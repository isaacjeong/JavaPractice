import java.util.ArrayList;

class MyStack{
    ArrayList<String> pringlesContainer = new ArrayList<String>();
    public void push(String chip){
        this.pringlesContainer.add(chip);
    }

    public String pop() {
        String toPop = this.pringlesContainer.get(pringlesContainer.size() -1);
        this.pringlesContainer.remove(this.pringlesContainer.get(pringlesContainer.size() -1));
        return toPop;
    }
}
public class Stack2 {
    public static void main(String[] args) {
        System.out.println("Starting");

        MyStack ms = new MyStack();
        ms.push("A");
        ms.push("B");
        ms.push("C");
        ms.push("D");

        System.out.println(ms.pop());
    }

}