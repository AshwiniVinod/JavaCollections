package com.learnprogramming;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> fibnocyList= Arrays.asList(1,1,2,3,5,8,13,21,34,55);
        System.out.println("position of 21 :"+ Collections.binarySearch(fibnocyList,21));
    }
}