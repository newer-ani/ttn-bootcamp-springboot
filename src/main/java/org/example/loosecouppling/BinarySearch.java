package org.example.loosecouppling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class BinarySearch {

    SortingAlgorithm sortingAlgorithm = new BubbleSort();
    @Autowired
    private SortingAlgorithm sortingAlgo;

    public int search( int element) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(21);
        list.add(12);
        list.add(10);
        list.add(45);
        list.add(23);
        // for Q2    sortingAlgorithm.sort(list);
        sortingAlgo.sort(list); //for question 3
        int result = Collections.binarySearch(list, element);
        return result;
    }
}
