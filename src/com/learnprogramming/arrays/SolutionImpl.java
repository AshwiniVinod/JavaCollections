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

    @Override
    public int[] mergSortOfNumberArray(int[] a, int n) {
            if (n < 2) {
                return a;
            }
            int mid = n / 2;
            int[] l = new int[mid];
            int[] r = new int[n - mid];

            for (int i = 0; i < mid; i++) {
                l[i] = a[i];
            }
            for (int i = mid; i < n; i++) {
                r[i - mid] = a[i];
            }
            System.out.println("l :"+l.toString()+" mid:"+mid);
            mergSortOfNumberArray(l, mid);
        System.out.println("r :"+r.toString()+" mid:"+mid);
            mergSortOfNumberArray(r, n - mid);
        for (int x:
             a) {
            System.out.print(x+" ,");
        }
        System.out.println("");
            merge(a, l, r, mid, n - mid);

        return a;
    }
    private void merge(int[] a,int[] l,int[] r,int left,int right ) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }


}
