package com.codegym;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        CollectionOperations collectionOperations = new CollectionUtilsAdapter();
        Client client = new Client(collectionOperations);
        Set<Integer> numbers = new HashSet<>(Arrays.asList(1, 5, 7, 3, 6, 9, 2));
        client.printMaxValue(numbers);
    }
}
