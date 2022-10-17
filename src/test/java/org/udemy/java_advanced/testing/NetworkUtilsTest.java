package org.udemy.java_advanced.testing;

import org.junit.jupiter.api.RepeatedTest;
import org.udemy.java_advanced.testing.NetworkUtils;

import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class NetworkUtilsTest {
    private static int testNumber;
    @RepeatedTest(10)
    //@Test(timeout = 1000) : in case we use '  org.junit.Test'
    public void getConnectionShouldTakeLessThan1Second() {
        testNumber++;
        assertTimeout(ofSeconds(1),  () -> NetworkUtils.getConnection(testNumber));
    }
}
