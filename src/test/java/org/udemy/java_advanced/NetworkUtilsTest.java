package org.udemy.java_advanced;

import org.junit.jupiter.api.Test;

import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class NetworkUtilsTest {

    @Test
    //@Test(timeout = 1000) : in case we use 'org.junit.Test'
    public void getConnectionShouldTakeLessThan1Second() {
        assertTimeout(ofSeconds(1),  () -> NetworkUtils.getConnection());
    }
}
