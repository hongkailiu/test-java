package tk.hongkailiu.test.app.sort.impl;

import tk.hongkailiu.test.app.heap.Heap;
import tk.hongkailiu.test.app.heap.impl.HeapMyImpl;
import tk.hongkailiu.test.app.helper.CollectionHelper;
import tk.hongkailiu.test.app.helper.CollectionHelperImpl;
import tk.hongkailiu.test.app.sort.Sorter;

import java.util.ArrayList;
import java.util.List;

/**
 * ref.
 * P Lafore 288
 *
 * @param <T> td
 * @author Liu
 */
public class HeapSorter<T extends Comparable<T>> implements Sorter<T> {

    private static CollectionHelper helper = CollectionHelperImpl.getInstance();
    private Heap<T> heap;

    @Override public void sort(final T[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        heap = new HeapMyImpl<>();
        for (T t : array) {
            heap.insert(t);
        }
        List<T> list = new ArrayList<>(array.length);
        for (int i = 0; i < array.length; i++) {
            list.add(heap.remove());
        }
        // reverse because it is in descending order by default
        list = helper.reverse(list);
        System.arraycopy(list.toArray(), 0, array, 0, array.length);
    }

}
