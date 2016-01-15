package tk.hongkailiu.test.app.sort;

public interface Sorter<T extends Comparable<T>> {

    /**
     * sort the array
     * @param array the array to sort
     */
    void sort(final T[] array);
}
