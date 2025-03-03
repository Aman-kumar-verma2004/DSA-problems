
//Reverse a stack without using extra space complexity
import java.util.Stack;
public class Stack1{
    public static void addAtTheBottom(Stack<Integer> s , int data){
        //Auxilary recursion
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        addAtTheBottom(s, data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        addAtTheBottom(s,top);
    }

    public static void displayStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverseStack(s);
        displayStack(s);
    }
}