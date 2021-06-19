public class Driver {
    public static void main(String[] args) {
        Integer[] array = {10, 50, -5, -3, 100, 54, -190, 12, 4, -543};
        Integer[] array1 = {10, 50, -5, -3, 100, 54, -190, 12, 4, -543};
        Integer[] array2 = {10, 50, -5, -3, 100, 54, -190, 12, 4, -543};
        Integer[] array3 = {10, 50, -5, -3, 100, 54, -190, 12, 4, -543};
        Integer[] array4 = {10, 50, -5, -3, 100, 54, -190, 12, 4, -543};
        Integer[] array5 = {10, 50, -5, -3, 100, 54, -190, 12, 4, -543};
        Integer[] array6 = {10, 50, -5, -3, 100, 54, -190, 12, 4, -543};
        Integer[] array7 = {10, 50, -5, -3, 100, 54, -190, 12, 4, -543};

        BubbleSort.sort(array);
        SelectionSort.sort(array1);
        InsertionSort.sort(array2);
        ShellSort.sort(array3);
        MergeSort.sort(array4);
        BubbleSortExample.sort(array5);
        QuickSort.sort(array6);
        HeapSort.sort(array7);

        System.out.print("Bubble Sort: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\nSelection Sort: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.print("\nInsertion Sort: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.print("\nShell Sort: ");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
        System.out.print("\nMerge Sort: ");
        for (int i = 0; i < array4.length; i++) {
            System.out.print(array4[i] + " ");
        }
        System.out.print("\nBubbleSortExample Sort: ");
        for (int i = 0; i < array5.length; i++) {
            System.out.print(array5[i] + " ");
        }
        System.out.print("\nQuick Sort: ");
        for (int i = 0; i < array6.length; i++) {
            System.out.print(array6[i] + " ");
        }
        System.out.print("\nHeap Sort: ");
        for (int i = 0; i < array7.length; i++) {
            System.out.print(array7[i] + " ");
        }


    }


}
