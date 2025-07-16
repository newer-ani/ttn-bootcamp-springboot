package org.example.loosecouppling;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class QuickSort implements SortingAlgorithm{

    public List<Integer> sort(List<Integer> list) {

        Collections.sort(list);
        return list;
    }
}
