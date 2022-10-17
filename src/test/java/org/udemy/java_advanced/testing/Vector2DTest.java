package org.udemy.java_advanced.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.udemy.java_advanced.testing.Vector2D;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class Vector2DTest {
    private static final double EPS = 1e-9;
    private Vector2D v;
    @BeforeEach
    public void createNewVector() {
        v = new Vector2D();
    }
    @Test
    public void newVectorSchouldHaveZeroLenght() {
        //action:
        /* Vector2D v = new Vector2D(); - implemented already in @BeforeEach */
        //assertion:
        assertEquals(0, v.length(), EPS);
    }
    @Test
    public void newVectorShouldHaveZeroX() {
        assertEquals(0, v.getX(), EPS);
    }
    @Test
    public void newVectorSchouldHaveZeroY() {
        assertEquals(0, v.getY(), EPS);
    }
}
