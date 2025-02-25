package JavaPrograms.LinkedList;

public class File2 {
    public static class Node{
        int data;
        Node next;
        public  Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //lets create head and tail for the linkedList
    public static Node head;
    public static Node tail;
    public static int size;

    //addNode
    public void addNodeFirst(int data){
        //Step 1) create a node first
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step 2) next pointer point toward head
        newNode.next = head;

        //Step 3) Make the new Node as head
        head = newNode;
    }

    public void addNodeLast(int data){
        //ceate new node
        Node newNode = new Node(data);
        size++;
        //base condition -> jb hamara linkdlist empty hoga
        if(head == null){
            head = tail = newNode;
            return;
        }
        //tail ka jo next hai wo hamare new node ko point kre
        tail.next = newNode;
        //tail ko newNode se replace kre
        tail = newNode;
    }

    public void addMiddle(int ind, int data){
        //base cond
        if(ind == 0){
            //mtlb mujhe apne head pr operation perform krna hai
            addNodeFirst(data);
            return;
        }
        //create a Node first

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;//. for tracking our temp as we take 0 base indexing
        while(i < ind -1 && temp != null){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print(){
        if(head == null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void removeFirst(){
        if(size == 0){
            System.out.println("Linked List is empty");
        }else if(size == 1){
            head = tail = null;
            size = 0;
            return;
        }

        head = head.next;
        size--;
    }
    public void removelast(){
        Node temp = head;
        Node prev = null;

        while(temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        size--;
    }
    public void removeAtAny(int pos){
        if(pos > size && pos < 0){
            System.out.println("Wrong Inputs");
            return;
        }
        else if(pos == 0){
            removeFirst();
            return;
        }else if(pos == size -1){
            removelast();
            return;
        }
        else {
            Node temp = head;
            Node prev = null;
            int counter = 0;
            while(counter < pos && temp != null){
                prev = temp;
                temp = temp.next;
                counter++;
            }
            prev.next = temp.next;
            temp.next = null;
        }

    }

    public static void main(String[] args) {
        File2 f = new File2();//we create the obj of file2
        f.print();
        f.addNodeFirst(2);
        f.print();
        f.addNodeFirst(1);
        f.print();
        f.addNodeLast(3);
        f.print();
        f.addNodeLast(4);
        f.print();
        f.addMiddle(0,10);
        f.print();
        f.removeAtAny(3);
        f.print();
    }
}