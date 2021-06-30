package com.learnprogramming.arrays;

import java.util.Collection;

public class SolutionImpl implements Solutions{

    @Override
    public int consecutive1s(int[] binaryArray) {
        int count1=0;
        int preCount1=0;
        boolean count0=false;
        for (int i:binaryArray
        ) {
            if (i==1){
                count1++;
            } else{
                count0=true;
            }
            if (count0){
                count1=0;
                count0=false;

            }
            if(preCount1<count1){
                preCount1=count1;
            }

        }
        return preCount1;
    }

    @Override
    public int findEvenDigitNumber(int[] inputArray) {
        int output=0;

        for ( int i:inputArray
        ) {
            int count=0;
            int num=i;
            while(num!=0){
                num=num/10;
                count++;
            }
            //check for even or odd
            if(count%2==0){
                output++;
            }

        }

        return output;
    }

    @Override
    public int[] assendingArrayofNumbers(int[] inputArray) {
        //[-4,-1,0,3,10]//[16,1,0,3,10] //[0,1,9,16,100]
        int[] squerArray;
        squerArray = new int[inputArray.length];
        int length1 = squerArray.length;
        for (int i = 0; i <inputArray.length ; i++) {
           int squer=inputArray[i]*inputArray[i];
            squerArray[i]=squer;
        }
        //bubble sort
        for (int i=0;i<squerArray.length; i++) {
            for (int j = 0; j < squerArray.length; j++) {
                if (squerArray[i] <squerArray[j]) {
                    int temp;
                    temp = squerArray[j];
                    squerArray[j] = squerArray[i];
                    squerArray[i] = temp;
                }
            }
        }
        return squerArray;
    }

}
