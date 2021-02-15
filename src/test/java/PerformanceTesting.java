import com.sparta.aaron.Sorters.BinarySort;
import com.sparta.aaron.Sorters.BubbleSort;
import com.sparta.aaron.Sorters.MergeSort;
import com.sparta.aaron.Sorters.SortManager;
import com.sparta.aaron.Starters.Printer;
import com.sparta.aaron.Starters.RandomArrayGenerator;
import org.junit.jupiter.api.Test;


public class PerformanceTesting {

    @Test
    void mergeSortTestAsc(){
        int[] randomArray = RandomArrayGenerator.generate(10);
        SortManager sorter = new MergeSort();
        long start = System.currentTimeMillis();
        sorter.sort(randomArray, "asc");
        long end = System.currentTimeMillis();
        Printer.printMessage("Time taken:: "+(end - start)+"ms"+"\n");
    }

    @Test
    void mergeSortTestDesc(){
        int[] randomArray = RandomArrayGenerator.generate(10);
        SortManager sorter = new MergeSort();
        long start = System.currentTimeMillis();
        sorter.sort(randomArray, "desc");
        long end = System.currentTimeMillis();
        Printer.printMessage("Time taken:: "+(end - start)+"ms"+"\n");
    }

    @Test
    void bubbleSortTestAsc(){
        int[] randomArray = RandomArrayGenerator.generate(10);
        SortManager sorter = new BubbleSort();
        long start = System.currentTimeMillis();
        sorter.sort(randomArray, "asc");
        long end = System.currentTimeMillis();
        Printer.printMessage("Time taken:: "+(end - start)+"ms"+"\n");
    }

    @Test
    void bubbleSortTestDesc(){
        int[] randomArray = RandomArrayGenerator.generate(10);
        SortManager sorter = new BubbleSort();
        long start = System.currentTimeMillis();
        sorter.sort(randomArray, "desc");
        long end = System.currentTimeMillis();
        Printer.printMessage("Time taken:: "+(end - start)+"ms"+"\n");
    }

    @Test
    void binarySortTests(){
        int[] randomArray = RandomArrayGenerator.generate(10);
        SortManager sorter = new BinarySort();
        long start = System.currentTimeMillis();
        sorter.sort(randomArray, "desc");
        long end = System.currentTimeMillis();
        Printer.printMessage("Time taken:: "+(end - start)+"ms"+"\n");

        start = System.currentTimeMillis();
        sorter.sort(randomArray, "asc");
        end = System.currentTimeMillis();
        Printer.printMessage("Time taken:: "+(end - start)+"ms"+"\n");


    }




}
