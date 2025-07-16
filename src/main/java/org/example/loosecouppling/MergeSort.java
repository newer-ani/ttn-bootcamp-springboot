package org.example.loosecouppling;

import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class MergeSort implements SortingAlgorithm{

    public List<Integer> sort(List<Integer> list) {

        Collections.sort(list);
        return list;
    }
}
