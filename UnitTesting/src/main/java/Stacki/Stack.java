package Stacki;

import java.util.ArrayList;

public class Stack {

    public int element;

    public boolean isEmpty(){
        return stacklist.getSize() == 0;
    }

    List<Integer> stacklist = new List<Integer>();

    public void push(int element){
        stacklist.add(element);
    }
    public int size() {
         return stacklist.getSize();
    }

    public int pop() {

        if(isEmpty()){
            throw new RuntimeException("junge was duast du stack is empty maan");
        }

        int lastElement = stacklist.get(stacklist.getSize());  //removed -1

        stacklist.remove(stacklist.getSize());
        return lastElement;
    }

    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("junge was duast du stack is empty maan");
        }
        return stacklist.get(stacklist.getSize());  // removed -1 bei getsize
    }

    public ArrayList<Integer> pop(int n) {

        if (n < 1 || n > stacklist.getSize()){
            throw new IllegalArgumentException("ned so fü im stack drinne");
        }
//
//        if(count == 0) {
//            return 0;
//        }
//        else {
//            count--;
//            return pop(count);
//    }
        ArrayList<Integer> tempList = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            tempList.add(pop());
        }
        return  tempList;
    }

        public String toString () {
            return stacklist.toString();
        }


}
