package Queuei;

public class List<T> {

    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;
    //public int index;

    public void add(T element) {   //current.next festlegen

        Node<T> newNode = new Node<T>(element);

        if (head == null) {

            head = newNode;
            tail = newNode;
            size++;

        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
            size++;
        }

    }

    public Node<T> find(int index){  //find and return node - statt boolean returnen
//        int half = size/2;
//
//        if (index <= half){                       //start head
//            Queuei.Node<T> current = head;
//
//            for (int i = 0; i < index; i++) {
//                current = current.next;
//            }
//            return current;
//        }
//        else {                                // start tail
//            Queuei.Node<T> current = tail;
//
//            for (int i = size; i > index ; i--) {
//                current = current.prev;
//            }
//            return current;
//        }

        Node<T> current = tail;
//        System.out.println("size = " + size + "; index = " + index);
        for (int i = size; i > index ; i--) {
            current = current.prev;
        }
//        if (current != null) {
//            System.out.println(current.data);
//        } else {
//            System.out.println("current ist null");
//        }
        return current;

    }

    public void add(int index, T element) {

        Node<T> newNode = new Node<T>(element);
        Node<T> tempFirst = null;
        Node<T> tempSec = null;
        Node<T> current = find(index);

        if (index == 0){
            current.prev = newNode;
            newNode.next = current;
            head = newNode;
            size++;
        }
        else if (index == size){      // oder if current.next == null

            add(element);

        }
        else {
            //    tempFirst = current.prev; // A->
            //    tempSec = current; // <- B
            newNode.next = current;
            //current.prev = newNode;
            newNode.prev = current.prev;

            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    public int getSize() {

        return size;
    }


    public String toString() {

        //StringBuilder

        String result = "";

        Node<T> current = head;

        while (current != null) {
            result += " " + current.data;

            current = current.next;
        }
        return result;
    }

    public String toStringReverse() {

        //StringBuilder

        String result = "";

        Node<T> current = tail;

        while (current != null) {
            result += " " + current.data;

            current = current.prev;
        }
        return result;
    }

    public String toStringUmdraht(){   // to string reverse =  liste rückwärts ausgeben ( starting from tail to head)

        String result = toString();
        int z = 0;
        char[] normal = result.toCharArray();
        char[] reverse = new char[normal.length];

        for (int i = normal.length-1; i > 0; i--) {
            reverse[z] = normal[i];
            z++;
        }
        result = String.valueOf(reverse);

        return result;
    }


    public T get(int index) {
//        System.out.println("get(" + index+")");
        Node<T> current = find(index);

        return current.data;
    }


    public void remove(int index) {

        Node<T> toDelete = find(index); // toDelete = tail, size 6, index 6
        Node<T> temp;

//        System.out.println("remove index = " + index);

        if (index == 1){
            head = toDelete.next;
            if (head != null) {
                head.prev = null;
            }else {
                tail = null;
            }
        }
        else if (index >= size - 1){
//            tail.next = null;   //original
//            tail = toDelete.prev;   // original
//            System.out.println("index == size");
            temp = toDelete.prev;
            tail = temp;
            temp.next = null;

        }
        else {
//            System.out.println("index != size und index != 0");
//            System.out.println("toDelete.data = " + toDelete.data);
            temp = toDelete.prev; //.next
            temp.next = toDelete.next;
            temp.next.prev = temp;
        }
        size--;
    }





}
