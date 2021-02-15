package com.sparta.aaron.Sorters;

public class BubbleSort extends SortManager{

    public static int[] bubble_sort(int[] numbers, String direction) {
        int temp;
        //boolean to check if the list is sorted
        boolean sorted = false;

        //Iterate through until nothing changes in the iteration
        while(!sorted){
            sorted = true;

            for (int i = 0; i < numbers.length - 1; i++) {

                //If the first number is lower than the second number swap their places and indicate that it isn't sorted
                if (numbers[i] < numbers[i + 1]) {
                    temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    sorted = false;
                } }
        }

        if(direction.equalsIgnoreCase("asc")){
            int temp2;
            for(int i = 0; i < numbers.length/2; i++){
                temp2 = numbers[i];
                numbers[i] = numbers[numbers.length -1-i];
                numbers[numbers.length-1-i] = temp2;
            }
        }

        //return the sorted set of numbers
        return numbers;
    }
}
