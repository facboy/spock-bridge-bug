package org.facboy;

import java.util.List;
import java.util.Optional;

class Parent<T, U> implements Doer<T, U> {
    @Override
    public Optional<U> doSomeThing(List<T> list) {
        throw new UnsupportedOperationException();
    }
}
