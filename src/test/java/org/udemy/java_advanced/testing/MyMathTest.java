package org.udemy.java_advanced.testing;

import org.junit.jupiter.api.Test;
import org.udemy.java_advanced.testing.MyMath;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MyMathTest {

    //@Test(expected = ArithmeticException.class) :     in case we use 'org.junit.Test'
    @Test
    public void ZeroDivisorShouldThrowException() {
        Exception exception =
                assertThrows(ArithmeticException.class, () -> MyMath.divide(1, 0));
        assertEquals("Can't divide by zero", exception.getMessage());
    }
}
