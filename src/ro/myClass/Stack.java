package ro.myClass;

public class Stack<String> {

    private Node<String> head = null;

    public int size(){
        int size= 0 ;
        while(head != null){
            size++;
            head = head.getNext();
        }
        return size;
    }
    public void push(String text){
        if(head == null){
            head = new Node<>();
            head.setNext(null);
            head.setData(text);
            head.setSizeData(0);
        }else{
            Node<String> aux = new Node<>();
            aux.setData(text);
            aux.setNext(head);
            head = aux;
        }
    }
    public void pop(){
        if (head == null) {
            System.out.println("Stiva este goala");
        } else {
            head = head.getNext();
        }
    }
    public Node<String> top(){
        while(head != null){
            head = head.getNext();
        }
        return head;

    }
}
