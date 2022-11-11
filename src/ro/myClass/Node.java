package ro.myClass;

public class Node<String> {

    private Node next = null;
    private String data = null;

    private int sizeData = 0;

    public Node getNext(){
        return next;
    }
    public void setNext(Node next){
        this.next = next;
    }
    public String getData(){
        return data;
    }
    public void setData(String data){
        this.data = data;
    }

    public int getSizeData() {
        return sizeData;
    }

    public void setSizeData(int sizeData) {
        this.sizeData = sizeData;
    }
}
