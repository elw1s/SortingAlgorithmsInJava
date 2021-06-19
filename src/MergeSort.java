public class MergeSort {
    public static <T extends Comparable<T>> void sort(T[] array){
        mergeSort(array,0, array.length);
    }

    private static <T extends Comparable<T>> void mergeSort(T[] array , int start , int end){
        if(end-start < 2) return;

        int mid = (end + start) / 2;

        mergeSort(array,start,mid);
        mergeSort(array,mid,end);
        merge(array,start,mid,end);
    }

    private static <T extends Comparable<T>> void merge(T[] array , int start , int mid , int end){

        if(array[mid - 1].compareTo(array[mid]) <= 0) return;

        int i = start;
        int j = mid;
        int tempIndex = 0;

        T[] tempArray = (T[]) new Comparable[end - start];

        while(i < mid && j < end){
            tempArray[tempIndex++] = array[i].compareTo(array[j]) <= 0 ? array[i++] : array[j++];
        }

        System.arraycopy(array,i,array,start + tempIndex,mid-i);
        System.arraycopy(tempArray,0,array,start,tempIndex);

    }



}
