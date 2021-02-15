import com.sparta.aaron.Sorters.BubbleSort;
import com.sparta.aaron.Sorters.MergeSort;
import com.sparta.aaron.Starters.Printer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.sparta.aaron.Sorters.BinarySort;

public class Testing {


    @Test
    void addElementTest(){
        BinarySort binarySort = new BinarySort();
        long start = System.nanoTime();
        binarySort.addElement(10);
        Assertions.assertEquals(true, binarySort.findElement(10));
        long end = System.nanoTime();
        Printer.printMessage("Add Element Test:: "+(end - start));
    }
    @Test
    void findElementTest(){
        BinarySort binarySort = new BinarySort();
        binarySort.addElement(5);
        Assertions.assertEquals(true, binarySort.findElement(10));
    }
    @Test
    void addElementsTest(){
        BinarySort binarySort = new BinarySort();
        int[] array = {10, 5, 2, 6, 8, 17, 15, 16};
        binarySort.addElements(array);
        Assertions.assertEquals(true, binarySort.findElement(15));
        Assertions.assertEquals(true, binarySort.findElement(16));
        Assertions.assertEquals(true, binarySort.findElement(17));
        Assertions.assertEquals(true, binarySort.findElement(6));
        Assertions.assertEquals(true, binarySort.findElement(2));
        Assertions.assertEquals(true, binarySort.findElement(5));
    }
    @Test
    void getRootElementTest(){
        BinarySort binarySort = new BinarySort();
        int[] array = {10, 5, 2, 6, 8, 17, 15, 16};
        binarySort.addElements(array);
        Assertions.assertEquals(10, binarySort.getRootElement());
    }
    @Test
    void getNumberOfElementsTest(){
        BinarySort binarySort = new BinarySort();
        Assertions.assertEquals(8, binarySort.getNumberOfElements());
    }
    @Test
    void getLeftChildTest(){
        BinarySort binarySort = new BinarySort();
        int[] array = {10, 5, 2, 6, 8, 17, 15, 16};
        binarySort.addElements(array);
        Assertions.assertEquals(2, binarySort.getLeftChild(5));
    }
    @Test
    void getRightChildTest(){
        BinarySort binarySort = new BinarySort();
        int[] array = {10, 5, 2, 6, 8, 17, 15, 16};
        binarySort.addElements(array);
        Assertions.assertEquals(6, binarySort.getRightChild(5));
    }
    @Test
    void getSortedTreeTest(){
        BinarySort binarySort = new BinarySort();
        int[] sortedArray = {2, 5, 6, 8, 10, 15, 16, 17};
        Assertions.assertArrayEquals(sortedArray, binarySort.getSortedTreeAsc());
    }

    @Test
    void mergeSortTest() {
        int[] array = {10, 5, 2, 6, 8, 17, 15, 16};
        int[] sortedArray = {2, 5, 6, 8, 10, 15, 16, 17};
        Assertions.assertArrayEquals(sortedArray, MergeSort.mergeSort(array, "asc"));
    }

    @Test
    void bubbleSortTest() {
        int[] array = {10, 5, 2, 6, 8, 17, 15, 16};
        int[] sortedArray = {2, 5, 6, 8, 10, 15, 16, 17};
        Assertions.assertArrayEquals(sortedArray, BubbleSort.bubble_sort(array, "asc"));
    }

}
