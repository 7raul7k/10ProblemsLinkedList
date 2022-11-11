package ro.myClass;

public class Queue<String> {

    Node<String> head = null;
    Node<String> coada = null;

    public int size(){
        int size = 0;
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
        }else{
            Node<String> aux = new Node<>();
            aux.setData(text);
            aux.setNext(head);
            head = aux;
            coada = aux;
        }

    }
    public Node<String> front(){
        while(head != null){
            head = head.getNext();
        }
        return head;
    }
    public Node<String> back(){
        return head;
    }
}
