package Queuei;

import Stacki.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class QueueTest {

    private Queue queue;

    @BeforeEach
    void setUp(){
         queue = new Queue();
    }

    @Test
    void enqueueTest(){

        queue.enqueue(4);
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(2);

        assertEquals(4, queue.size());
    }

    @Test
    void dequeueTest(){

        queue.enqueue(4);
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(2);
        queue.dequeue();

        assertEquals(3, queue.size());
    }

    @Test
    void dequeueReturnTest(){

        queue.enqueue(4);
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(2);

        assertEquals(4, queue.dequeue());
    }

    @Test
    void dequeueMultiTest(){

        queue.enqueue(4);
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(2);

        ArrayList<Integer> result = queue.dequeue(2);
        assertEquals(4, result.get(0));
        assertEquals(3, result.get(1));

    }

    @Test //Test for an IllegalArgument
    void exceptionDequeueMultiTest(){

        assertThrows(IllegalArgumentException.class, () -> {

            queue.dequeue(4);

        }, "sdfdffd");
    }

    @Test //Test for an IllegalArgument
    void exceptionDequeueTest(){

        assertThrows(RuntimeException.class, () -> {

            queue.dequeue();

        }, "sdfdffd");
    }

}
