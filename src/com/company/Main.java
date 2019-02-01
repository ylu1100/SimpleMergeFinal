package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10};
        System.out.println("Merging: {1,3,5,7,9} and {2,4,6,8,10}");
        int[] resultArr = SimpleMerge.simpleMerge(arr1,arr2);
        for (int i:resultArr)
            System.out.print(i+" ");
        System.out.println();

        int[] arr3 = {1,2,3,4,5};
        int[] arr4 = {6,7,8,9,10};
        System.out.println("Merging: {1,2,3,4,5} and {6,7,8,9,10} ");
        resultArr = SimpleMerge.simpleMerge(arr3,arr4);
        for (int i:resultArr)
            System.out.print(i+" ");
        System.out.println();

        int[] arr5 = {1,2,3,9,10};
        int[] arr6 = {4,5,6,7,8};
        System.out.println("Merging: {1,2,3,9,10} and {4,5,6,7,8}");
        resultArr = SimpleMerge.simpleMerge(arr3,arr4);
        for (int i:resultArr)
            System.out.print(i+" ");
        System.out.println();
    }
}