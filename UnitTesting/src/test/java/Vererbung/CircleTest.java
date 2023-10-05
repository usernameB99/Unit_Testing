package Vererbung;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CircleTest {

private Shape circle;

    @BeforeEach
    void setUp(){
        circle = new Circle("blue", true, 1);
    }

    @Test
    void calculateAreaTest(){
        assertEquals(Math.PI,circle.getArea());
    }

    @Test
    void calculatePerimeterTest(){
        assertEquals(6.283185307179586,circle.getPerimeter());
    }

    @Test
    void calculateAreaExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> {

            Shape circle1 = new Circle("blue", true, -1);


            circle1.getArea();

        }, "sdfdffd");
    }

    @Test
    void calculatePerimeterExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> {
            Shape circle1 = new Circle("blue", true, -1);

            circle1.getPerimeter();

        }, "sdfdffd");
    }



}
