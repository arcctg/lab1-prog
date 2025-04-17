package org.arcctg;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Iterator<Integer> counter = new IncrementalCounterGenerator(1);
        IteratorConsumer.consumeIteratorWithTimeout(counter, 5);
    }
}
