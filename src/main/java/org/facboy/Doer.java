package org.facboy;

import java.util.List;
import java.util.Optional;

public interface Doer<T, U> {
    Optional<U> doSomeThing(List<T> list);
}
