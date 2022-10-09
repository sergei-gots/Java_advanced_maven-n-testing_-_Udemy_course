package org.udemy.java_advanced;

import org.junit.jupiter.api.Test;
import org.udemy.java_advanced.Vector2D;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Vector2DTest {

    @Test
    public void newVectorSchouldHaveZeroLenght() {
        //action:
        Vector2D v = new Vector2D();
        //assertion:
        assertEquals(0, v.length(), 1e-9);
    }

    @Test
    public void newVectorShouldHaveZeroX() {
        Vector2D v = new Vector2D();
        assertEquals(0, v.getX(), 1e-9);
    }

    @Test
    public void newVectorSchouldHaveZeroY() {
        Vector2D v = new Vector2D();
        assertEquals(0, v.getY(), 1e-9);
    }
}
