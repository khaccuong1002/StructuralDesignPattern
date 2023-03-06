package com.codegym;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        RandomList randomList = new RandomList();
        List<Integer> numbers = randomList.generateList(10, 1, 100);

        ListFilter listFilter = new ListFilter();
        List<Integer> evenNumbers = listFilter.filterOdd(numbers);

        ListPrinter listPrinter = new ListPrinter();
        listPrinter.printList(evenNumbers);
    }
}
