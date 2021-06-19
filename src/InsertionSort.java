public class InsertionSort {

    public static <T extends Comparable<T>> void sort(T[] array){

        for(int i = 1; i < array.length; i++){
            T current = array[i];
            int k = i;
            for(; k > 0 && array[k-1].compareTo(current) > 0; k--){
                array[k] = array[k-1];
            }
            array[k] = current;
        }

    }

}
