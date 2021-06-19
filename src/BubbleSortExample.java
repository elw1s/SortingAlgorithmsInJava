public class BubbleSortExample {
    public static <T extends Comparable<T>> void sort(T[] array){
        for(int i = 0; i < array.length; i++) {
            for (int k = 1; k < array.length-i; k++) {
                if (array[k].compareTo(array[k - 1]) < 0) {
                    T temp = array[k];
                    array[k] = array[k - 1];
                    array[k - 1] = temp;
                }
            }
        }
    }
}
