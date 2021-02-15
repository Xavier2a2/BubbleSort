import com.sparta.aaron.Sorters.SortManager;
import com.sparta.aaron.Starters.Printer;
import com.sparta.aaron.Starters.RandomArrayGenerator;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class PerformanceTesting {

    @Test
    void beginTests(){
        Printer.printMessage("Begin tests\n");
    }
    @Test
    void mergeSortTestAsc(){
        int[] randomArray = RandomArrayGenerator.generate(10);
        SortManager sorter = new SortManager();
        long start = System.currentTimeMillis();
        sorter.sort(randomArray, "merge", "asc");
        long end = System.currentTimeMillis();
        Printer.printMessage("Time taken:: "+(end - start)+"\n");
    }

    @Test
    void mergeSortTestDesc(){
        int[] randomArray = RandomArrayGenerator.generate(10);
        SortManager sorter = new SortManager();
        long start = System.currentTimeMillis();
        sorter.sort(randomArray, "merge", "desc");
        long end = System.currentTimeMillis();
        Printer.printMessage("Time taken:: "+(end - start)+"\n");
    }

    @Test
    void bubbleSortTestAsc(){
        int[] randomArray = RandomArrayGenerator.generate(10);
        SortManager sorter = new SortManager();
        long start = System.currentTimeMillis();
        sorter.sort(randomArray, "bubble", "asc");
        long end = System.currentTimeMillis();
        Printer.printMessage("Time taken:: "+(end - start)+"\n");
    }

    @Test
    void bubbleSortTestDesc(){
        int[] randomArray = RandomArrayGenerator.generate(10);
        SortManager sorter = new SortManager();
        long start = System.currentTimeMillis();
        sorter.sort(randomArray, "bubble", "desc");
        long end = System.currentTimeMillis();
        Printer.printMessage("Time taken:: "+(end - start)+"\n");
    }

    @Test
    void binarySortTests(){
        int[] randomArray = RandomArrayGenerator.generate(10);
        SortManager sorter = new SortManager();
        long start = System.currentTimeMillis();
        sorter.sort(randomArray, "binary", "desc");
        long end = System.currentTimeMillis();
        Printer.printMessage("Time taken:: "+(end - start)+"\n");

        start = System.currentTimeMillis();
        sorter.sort(randomArray, "binary", "asc");
        end = System.currentTimeMillis();
        Printer.printMessage("Time taken:: "+(end - start)+"\n");


    }




}
