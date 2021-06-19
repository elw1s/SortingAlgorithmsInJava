public class QuickSort {
    public static <T extends Comparable<T>> void sort(T[] array){
        quickSort(array, 0 , array.length);

    }

    private static <T extends Comparable<T>> void quickSort(T[] array , int start , int end){
        if(end - start < 2) return;

        int pivotIndex = partition(array, start , end);
        quickSort(array , start , pivotIndex);
        quickSort(array , pivotIndex+1, end);
    }

    private static <T extends Comparable<T>> int partition(T[] array , int start , int end){
        T pivot = array[start];
        int i = start;
        int j = end;

        while( i < j){

            while(i < j && array[--j].compareTo(pivot) >= 0);
            if(i < j) array[i] = array[j];

            while(i < j && array[++i].compareTo(pivot) <= 0);
            if(i < j) array[j] = array[i];

        }
        array[j] = pivot;
        return j;
    }

}
