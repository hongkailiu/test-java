package tk.hongkailiu.test.app.heap;

import java.util.Queue;

public interface Heap<T extends Comparable<T>> {

    /**
     * insert an elem into the heap
     * @param t the elem t
     * @return {@code true} (as specified by {@link Queue#offer})
     */
    boolean insert(T t);

    /**
     * remove the element of the heap at the top
     * @return the removed element
     */
    T remove();
}
