package Vererbung;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleTest {

    private Shape rectangle;

    @BeforeEach
    void setUp(){
        rectangle = new Rectangle("blue", true, 2, 3);
    }

    @Test
    void calculateAreaTest(){
        assertEquals(6,rectangle.getArea());
    }

    @Test
    void calculatePerimeterTest(){
        assertEquals(10,rectangle.getPerimeter());
    }

    @Test
    void calculateAreaExceptionTest1(){
        assertThrows(IllegalArgumentException.class, () -> {

            Shape rectangle2 = new Rectangle("blue", true, -1, 3);

            rectangle2.getArea();

        }, "sdfdffd");
    }

    @Test
    void calculateAreaExceptionTest2(){
        assertThrows(IllegalArgumentException.class, () -> {

            Shape rectangle2 = new Rectangle("blue", true, 2, -1);

            rectangle2.getArea();

        }, "sdfdffd");
    }


    @Test
    void calculatePerimeterExceptionTest1(){
        assertThrows(IllegalArgumentException.class, () -> {

            Shape rectangle2 = new Rectangle("blue", true, -1, 3);

            rectangle2.getPerimeter();

        }, "sdfdffd");
    }

    @Test
    void calculatePerimeterExceptionTest2(){
        assertThrows(IllegalArgumentException.class, () -> {

            Shape rectangle2 = new Rectangle("blue", true, 2, -1);            rectangle.getPerimeter();

            rectangle2.getPerimeter();


        }, "sdfdffd");
    }



}
