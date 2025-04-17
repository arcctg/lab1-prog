package org.arcctg;

import java.util.Iterator;
import java.util.NoSuchElementException;

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
        if (hasNext()) {
            return currentValue++;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Remove not supported.");
    }
}
