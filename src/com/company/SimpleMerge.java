package com.company;

public class SimpleMerge {
    public static int[] simpleMerge(int [] arr1, int[] arr2)
    {
        int arr3 [] = new int[arr1.length+arr2.length];
        int ind = 0;
        int i = 0;
        int a = 0;
        while ((i<arr1.length-1) && (a<arr2.length-1))
        {
            if (arr1[i] < arr2[a])
            {
                arr3[ind] = arr1[i];
                ind++;
                i++;
            }
            else
            {
                arr3[ind] = arr2[a];
                ind++;
                a++;
            }
        }
        while(i<arr1.length){
            arr3[ind] = arr1[i];
            i++;
            ind++;
        }
        while(a<arr2.length){
            arr3[ind] = arr2[a];
            a++;
            ind++;
        }
        return arr3;
    }
}


