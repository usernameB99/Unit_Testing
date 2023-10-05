package Queuei;

import java.util.ArrayList;

public class Queue {

    List<Integer> queue = new List<Integer>();

    public boolean isEmpty(){
        return queue.getSize() == 0;
    }

    public void enqueue(int newElement){
        queue.add(newElement);
    }

    public int size(){
        return queue.getSize();
    }

    public int dequeue(){

        if(isEmpty()){
            throw new RuntimeException("junge was duast du queue is empty maan");
        }

        int firstElement = queue.get(1);  //removed -1
        //System.out.println("firstElement: " + firstElement);
        queue.remove(1);

        return firstElement;
    }

    public ArrayList<Integer> dequeue(int n) {

        if (n < 1 || n > queue.getSize()){
            throw new IllegalArgumentException("ned so fü im stack drinne");
        }

        ArrayList<Integer> tempList = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            tempList.add(dequeue());
        }
        return  tempList;
    }

    public String toString () {
        return queue.toString();
    }
}
