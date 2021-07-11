package com.learnprogramming;

import com.learnprogramming.BST.BinarySearchTree;
import com.learnprogramming.BST.Node;
import com.learnprogramming.arrays.Dvd;
import com.learnprogramming.arrays.SolutionImpl;
import com.learnprogramming.arrays.Solutions;


public class Main {

    public static void main(String[] args) {
        /*List<Integer> fibnocyList= Arrays.asList(1,1,2,3,5,8,13,21,34,55);
        System.out.println("position of 21 :"+ Collections.binarySearch(fibnocyList,21));*/

        /*Dvd[] dvdCollection=new Dvd[15];
        Dvd avengersDvd=new Dvd("Avengers",2012,"Joss Whedon");
        dvdCollection[1]=avengersDvd;
        Dvd incrediblesDVD = new Dvd("The Incredibles", 2004, "Brad Bird");
        Dvd findingDoryDVD = new Dvd("Finding Dory", 2016, "Andrew Stanton");
        Dvd lionKingDVD = new Dvd("The Lion King", 2019, "Jon Favreau");
        dvdCollection[2]=incrediblesDVD;
        dvdCollection[3]=findingDoryDVD;
        dvdCollection[4]=lionKingDVD;
        int[] intArray=new int[10];
        for (int i = 0; i < 10; i++) {
            intArray[i]=(i+1);
        }
        for (int i:intArray
        ) {
            System.out.print(i);
        }*/
        //Find consecutive 1s in binary Array
       /* int[] binaryArray= { 1, 0, 1,1,1, 0, 1, 0, 0,1,1,1,1,1,1 };
        Solutions solutions=new SolutionImpl();
        int count1=solutions.consecutive1s(binaryArray);
        System.out.println("consicative number of 1s :"+count1);*/

        //returns the even digit number count in an array
        /*int[] nums ={12,345,2,6,7896};
        Solutions solutions=new SolutionImpl();
        int count1=solutions.findEvenDigitNumber(nums);
        System.out.println("number of even digit numbers in given array is :"+count1);*/

        //return the squer array in assending order
        int[] nums ={-4,-1,0,3,10};
        Solutions solutions=new SolutionImpl();
        //int[] count1=solutions.assendingArrayofNumbers(nums);
         //MERGE SOART
        int[] inputArray={ 5, 1, 6};
        /*int[] count1=solutions.mergSortOfNumberArray(inputArray,inputArray.length);
        for (int i:
             count1) {
            System.out.print(i+",");
        }   */

        //binary tree search
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.inorder();
        Node root=tree.search(tree.getRoot(), 40);
        System.out.println("Key present"+root.getKey());

    }
}
