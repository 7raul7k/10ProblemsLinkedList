package ro.myClass;

public class LinkedList {

    private Node head = null;

    public void addStart(String text) {
        if (head == null) {
            head = new Node();
            head.setNext(null);
            head.setData(text);
            head.setSizeData(head.getSizeData()+1);
        } else {
            Node node = new Node();
            head.getNext();
            node.setNext(head);
            node.setData(text);
            node.setSizeData(head.getSizeData()+1);
            head = node;
        }
    }

    public void reverse() {
        if (head == null) {
            head = new Node();
        } else {
            Node prev = new Node(), aux = new Node(), next = new Node();
            aux = head;

            while (aux != null) {
                next = aux.getNext();
                head.setNext(prev);
                prev = aux;
                aux = next;


            }

        }

    }

    public void set(String obj, int pos) {
        Node aux = head;
        int ct = 0;
        while (aux != null && ct != pos) {
            ct++;
            aux = aux.getNext();
        }
        aux.setData(obj);
    }

    public void sort() {

        boolean flag = true;
        do {
            flag = true;
            for (int i = 0; i < this.size() - 1; i++) {

                if (this.get(i).compareTo(this.get(i + 1)) > 0) {
                    String nod = this.get(i);
                    this.set(this.get(i + 1), i);
                    this.set(nod, i + 1);

                    flag = false;
                }
            }
        } while (flag == false);
    }

    public String get(int pos) {

        Node aux = head;
        int ct = 0;

        while (aux != null && ct != pos) {

            ct++;
            aux = aux.getNext();

        }

        return (String) aux.getData();

    }


    public int size() {
        int size = 0;
        while (head != null) {
            size++;
            head = head.getNext();
        }
        return size;

    }

    public void afisare() {

        Node aux = head;

        while (aux != null) {

            System.out.println(aux.getData());
            System.out.println(aux.getSizeData());
            aux = aux.getNext();

        }

    }

    public String maximum() {
        Node aux = new Node();
        aux.setNext(null);
        boolean flag = false;
        do {
            for (int i = 0; i < this.size() - 1; i++) {

                if (this.get(i).compareTo(this.get(i + 1)) > 0) {

                    String x = this.get(i);
                    aux.setData(x);
                    flag = true;

                }
                if (this.get(i).compareTo(this.get(i + 1)) < 0) {

                    String x = this.get(i + 1);
                    aux.setData(x);
                    flag = true;
                }
            }

        } while (flag == false);
        return (String) aux.getData();
    }
    public void removeMiddle(){
        int pos = this.size()/2;
        int ct = 0;
        while (head!= null && ct!=pos){
            ct++;
            head = head.getNext();
        }
        head.setNext(head.getNext().getNext());
    }
}
