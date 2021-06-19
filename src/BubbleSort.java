public class BubbleSort {
    public static <T extends Comparable<T>> void sort(T[] array){
        for(int i = array.length - 1; i > 0; i--) {
            for (int k = 0; k < i; k++) {
                if (array[k].compareTo(array[k + 1]) > 0) {
                    T temp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                }
            }
        }
    }
}
