package Stacki;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StackTest {

    private Stack stack;

    @BeforeEach
    void setUp(){
        stack = new Stack();
    }

    @Test
    void pushTest(){

        stack.push(5);
        stack.push(6);
        stack.push(7);

        assertEquals(3, stack.size());
    }

    @Test
    void popTest(){

        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(1);
        stack.push(2);
        stack.pop();
        stack.pop();

        assertEquals(3, stack.size());
    }

    @Test
    void popReturnTest(){

        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(1);
        stack.push(2);
        stack.pop();

        assertEquals(1, stack.pop());
    }

    @Test
    void popingerMultiTest(){

        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(1);
        stack.push(2);
        ArrayList<Integer> result = stack.pop(4);
        assertEquals(2, result.get(0));
        assertEquals(1, result.get(1));
        assertEquals(7, result.get(2));
        assertEquals(6, result.get(3));
    }

    @Test
    void peekTest(){

        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(1);
        stack.push(2);


        assertEquals(2, stack.peek());
    }

    @Test //Test for an IllegalArgument
    void exceptionPopMultiTest(){


        assertThrows(IllegalArgumentException.class, () -> {

            stack.pop(4);

        }, "sdfdffd");
    }

    @Test //Test for an IllegalArgument
    void exceptionPopTest(){

        assertThrows(RuntimeException.class, () -> {

            stack.pop();

        }, "sdfdffd");
    }

    @Test //Test for an IllegalArgument
    void exceptionPeekTest(){

        assertThrows(RuntimeException.class, () -> {

            stack.peek();

        }, "sdfdffd");
    }

}
