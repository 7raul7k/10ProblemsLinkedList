package ro.myClass;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.addStart("Alex");
        linkedList.addStart("Ionut");
        linkedList.addStart("Teo");
        linkedList.addStart("Marian");
        linkedList.addStart("Marcel");

//        linkedList.sort();
        linkedList.afisare();
        }


}