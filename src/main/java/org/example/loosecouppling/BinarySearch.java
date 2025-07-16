package org.example.loosecouppling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

    SortingAlgorithm sortingAlgorithm = new BubbleSort();

    public int search( int element) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(21);
        list.add(12);
        list.add(10);
        list.add(45);
        list.add(23);
        sortingAlgorithm.sort(list);
        int result = Collections.binarySearch(list, element);
        return result;
    }
}
