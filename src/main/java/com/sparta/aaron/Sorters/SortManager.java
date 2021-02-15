package com.sparta.aaron.Sorters;

import com.sparta.aaron.Starters.Printer;

import java.util.Locale;

public abstract class SortManager {

//    public void sort(int[] arrayToSort, String mode, String direction) {
//        //Print the unsorted array
//        Printer.printIntArray(arrayToSort);
//
//        //Sort the array based on the chosen sorting mode
//        if (mode.equalsIgnoreCase("bubble") ){
//            Printer.printIntArray(BubbleSort.bubble_sort(arrayToSort, direction.toLowerCase()));
//            Printer.printMessage("Sorted using the Bubble Sort");
//
//        } else if (mode.equalsIgnoreCase("merge")){
//            Printer.printIntArray(MergeSort.mergeSort(arrayToSort));
//            Printer.printMessage("Sorted using the Merge Sort");
//
//        } else if (mode.equalsIgnoreCase("binary")){
//            BinarySort binarySort = new BinarySort();
//            binarySort.addElements(arrayToSort);
//            if (direction.equalsIgnoreCase("asc") ){
//                Printer.printIntArray(binarySort.getSortedTreeAsc());
//            } else {
//                Printer.printIntArray(binarySort.getSortedTreeDesc());
//            }
//            Printer.printMessage("Sorted using the Binary Tree Sort");
//
//
//        }
//    }

    public abstract void sort(int[] arrayToSort, String direction);
}