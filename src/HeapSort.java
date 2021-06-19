public class HeapSort {
    public static <T extends Comparable<T>> void sort(T[] array){
        buildHeap(array);
        int lastElementIndex = array.length - 1;
        for(int i = 0; i < array.length; i++){
            T element = array[0];
            array[0] = array[lastElementIndex - i];
            array[lastElementIndex - i] = element;
            heafipyBelow(array , 0 , lastElementIndex - i - 1);
        }
    }

    private static <T extends Comparable<T>> void buildHeap(T[] array){
        heafipyBelow(array,0, array.length - 1);
    }

    private static <T extends Comparable<T>> void heafipyBelow(T[] array,int index , int lastElement){
        int swap;
        while(index > 0 || lastElement >= index){
            int left = ( index * 2 ) + 1;
            int right = ( index * 2 ) + 2;
            if(left <= lastElement){
                if(right > lastElement){
                 swap = left;
                }
                else{
                    swap = array[left].compareTo(array[right]) > 0 ? left : right;
                }
                if(array[swap].compareTo(array[index]) > 0){
                    T temp_element = array[swap];
                    array[swap] = array[index];
                    array[index] = temp_element;
                }
                else break;
                index = swap;
            }
            else break;
        }

    }

}
