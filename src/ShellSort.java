public class ShellSort {
    public static <T extends Comparable<T>> void sort(T[] array){
        for(int gap = array.length/2; gap > 0; gap/=2){
            for(int i = gap; i < array.length; i++) {
                T current = array[i];
                int k = i;
                while (k >= gap && array[k - gap].compareTo(current) > 0) {
                    array[k] = array[k - gap];
                    k -= gap;
                }
                array[k] = current;
            }
        }
    }
}
