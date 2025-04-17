package org.arcctg;

import java.util.Iterator;

public class IteratorConsumer {

    public static <T> void consumeIteratorWithTimeout(Iterator<T> iterator, int timeoutSeconds) {
        long startTime = System.currentTimeMillis();
        long endTime = startTime + (timeoutSeconds * 1000L);
        int count = 0;

        System.out.println("Starting consumption for " + timeoutSeconds + " seconds...");

        while (iterator.hasNext() && System.currentTimeMillis() < endTime) {
            T value = iterator.next();
            System.out.println("Processing value: " + value);
            count++;
        }

        System.out.println("Consumption finished. Processed " + count + " items.");
    }
}
