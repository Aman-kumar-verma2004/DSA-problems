package JavaPrograms.LinkedList;

public class File1 {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            //A parametrized Constructor
            this.data = data;
            this.next = null;
            System.out.println(data);
        }
        public void get(){
            System.out.println(data);
        }
    }
    public static void main(String[] args) {
        Node n = new Node(123);
        n.get();

    }
}