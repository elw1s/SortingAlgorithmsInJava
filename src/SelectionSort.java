public class SelectionSort {

    public static <T extends Comparable<T>> void sort(T[] array){

        for(int i = array.length-1; i > 0; i--){
            int max = 0;
            for(int k = 1; k <= i; k++){
                if(array[max].compareTo(array[k]) < 0) max = k;
            }
            T temp = array[max];
            array[max] = array[i];
            array[i] = temp;
        }
    }
}
