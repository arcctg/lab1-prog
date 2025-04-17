package org.arcctg;

import java.util.Iterator;

public class IteratorConsumer {

    public static <T> void consumeIteratorWithTimeout(Iterator<T> iterator, int timeoutSeconds) {
        long startTime = System.currentTimeMillis();
        long endTime = startTime + (timeoutSeconds * 1000L);
        int count = 0;

        System.out.printf("Starting consumption for %d seconds...%n", timeoutSeconds);

        while (iterator.hasNext() && System.currentTimeMillis() < endTime) {
            T value = iterator.next();
            System.out.println("Processing value: " + value);
            count++;
        }

        System.out.printf("Consumption finished. Processed %d items.%n", count);
    }
}
