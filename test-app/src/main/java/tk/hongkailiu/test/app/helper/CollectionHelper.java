package tk.hongkailiu.test.app.helper;

import java.util.List;

public interface CollectionHelper {
    /**
     *
     * @param list td
     * @param <T> td
     * @return td
     */
     <T> List<T> removeDuplicate(List<T> list);

    /**
     * Returns true if the iterables have the same elements in the same order.
     *
     * @param i1 td
     * @param i2 td
     * @param <T> td
     * @return td
     */
     <T> boolean elementsEqual(Iterable<T> i1, Iterable<T> i2);

    /**
     * Returns true if each element in iterable after the first is greater than
     * or equal to the element that preceded it, according to this ordering.
     * Note that this is always true when the iterable has fewer than two
     * elements.
     *
     * @param iterable td
     * @param <T> td
     * @return td
     */
     <T> boolean isOrdered(Iterable<? extends Comparable<T>> iterable);

    /**
     * Returns a reversed view of the specified list. For example,
     * Lists.reverse(Arrays.asList(1, 2, 3)) returns a list containing 3, 2, 1.
     * The returned list is backed by this list, so changes in the returned list
     * are reflected in this list, and vice-versa. The returned list supports
     * all of the optional list operations supported by this list. The returned
     * list is random-access if the specified list is random access.
     *
     * @param list td
     * @param <T> td
     * @return td
     */
     <T> List<T> reverse(List<T> list);
}
