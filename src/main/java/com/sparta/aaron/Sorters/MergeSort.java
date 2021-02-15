package com.sparta.aaron.Sorters;

import com.sparta.aaron.Starters.Printer;

public class MergeSort extends SortManager {

    public static int[] mergeSort(int[] array, String direction){
        int[] sortedArray = mergeSort(array);
        if(direction.equalsIgnoreCase("desc")){
            int temp2;
            for(int i = 0; i < sortedArray.length/2; i++){
                temp2 = sortedArray[i];
                sortedArray[i] = sortedArray[sortedArray.length -1-i];
                sortedArray[sortedArray.length-1-i] = temp2;
            }
        }

        return sortedArray;
    }


    public static int[] mergeSort(int[] array) {
        int size = array.length;
        if (size <= 1) {
            return array;
        }

        int midpoint = size / 2;
        int[] lHalf = new int[midpoint];
        int[] rHalf = new int[size - midpoint];


        System.arraycopy(array, 0, lHalf, 0, midpoint);

        if (size - midpoint >= 0) System.arraycopy(array, midpoint, rHalf, 0, size - midpoint);

        mergeSort(lHalf);

        mergeSort(rHalf);

        return merge(array, lHalf, rHalf, midpoint, size - midpoint);
    }

    public static int[] merge(int[] array, int[] lHalf, int[] rHalf, int midpoint, int midpointOnwards) {

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < midpoint && j < midpointOnwards) {

            if (lHalf[i] <= rHalf[j]) {
                array[k++] = lHalf[i++];
            } else {
                array[k++] = rHalf[j++];
            }
        }

        while (i < midpoint) {
            array[k++] = lHalf[i++];
        }

        while (j < midpointOnwards) {
            array[k++] = rHalf[j++];
        }
        return array;
    }

    @Override
    public void sort(int[] arrayToSort, String direction) {
        Printer.printIntArray(arrayToSort);
        Printer.printIntArray(mergeSort(arrayToSort, direction));
        Printer.printMessage("Sorted using the Merge Sort");
    }
}
