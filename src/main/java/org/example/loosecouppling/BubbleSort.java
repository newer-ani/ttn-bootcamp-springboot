package org.example.loosecouppling;

import java.util.Collections;
import java.util.List;

public class BubbleSort implements SortingAlgorithm{

    public List<Integer> sort(List<Integer> list) {

        Collections.sort(list);
        return list;
    }
}
