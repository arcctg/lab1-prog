package org.arcctg;

import java.util.Iterator;

public class IncrementalCounterGenerator implements Iterator<Integer> {
    private int currentValue;

    public IncrementalCounterGenerator(int startValue) {
        this.currentValue = startValue;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        int valueToReturn = currentValue;
        currentValue++;
        return valueToReturn;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Remove not supported.");
    }
}
