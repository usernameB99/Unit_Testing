package Stacki;

public class Main2 {

    public static void main(String[] args) {

        Stack Stacklist = new Stack();

        Stacklist.push(5);
        Stacklist.push(8);
        Stacklist.push(2);
        Stacklist.push(6);
        Stacklist.push(1);
        Stacklist.push(7);
        Stacklist.push(9);

        System.out.println(Stacklist.toString());
        System.out.println(Stacklist.stacklist.toStringReverse());

        System.out.println("popped element :" + Stacklist.pop(3));

        System.out.println(Stacklist);



        System.out.println("size :" + Stacklist.size());


    }
}
