package org.udemy.java_advanced.testing;

import java.util.Random;

public class NetworkUtils {

    private static Random random = new Random();
    public static void getConnection(int connectionId) {
        //get a connection with a server
        //Let's assume a timeout could be btw 970 and 1010 ms
        int nEstimatedTimeout = 970 + random.nextInt(0,41);
        System.out.println(connectionId + "). Timeout to set up a connection will be  " + nEstimatedTimeout + " ms");
        try {
            Thread.sleep(nEstimatedTimeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
