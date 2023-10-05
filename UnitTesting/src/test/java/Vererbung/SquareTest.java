package Vererbung;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SquareTest {

    private Shape square;

    @BeforeEach
    void setUp(){
        square = new Square("blue", true, 2);
    }

    @Test
    void calculateAreaTest(){
        assertEquals(4,square.getArea());
    }

    @Test
    void calculatePerimeterTest(){
        assertEquals(8,square.getPerimeter());
    }

    @Test
    void calculateAreaExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> {

            Shape square1 = new Square("blue", true, -1);

            square1.getArea();

        }, "sdfdffd");
    }

    @Test
    void calculatePerimeterExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> {

            Shape square1 = new Square("blue", true, -1);

            square1.getPerimeter();

        }, "sdfdffd");
    }


}
