package com.sparta.aaron.Sorters;

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


        for (int i = 0; i < midpoint; i++) {
            lHalf[i] = array[i];
        }

        for (int i = midpoint; i < size; i++) {
            rHalf[i - midpoint] = array[i];
        }

        mergeSort(lHalf);

        mergeSort(rHalf);

        array = merge(array, lHalf, rHalf, midpoint, size - midpoint);
        return array;
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
}
