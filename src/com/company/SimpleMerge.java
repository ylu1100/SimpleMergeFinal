/**
 * Created by Teacher on 1/28/2019.
 * simpleMerge takes in two sorted arrays of
 * integers and merges them to return one sorted
 * array of integers.
 */
public class SimpleMerge {
    public static int[] simpleMerge(int[] arr1, int[] arr2) {
        int[] combarray = new int[arr1.length + arr2.length];
        int ind = 0;
        int ind1=0;
        int ind2=0;
        while (ind < combarray.length){
            if (ind1==arr1.length && ind2<arr2.length){
                combarray[ind]=arr2[ind2];
                ind2++;
            }
            if (ind2==arr2.length && ind1<arr1.length){
                combarray[ind]=arr1[ind1];
                ind1++;
            }
            if((ind1<arr1.length && ind2<arr2.length)&&arr1[ind1]<arr2[ind2]){
                combarray[ind]=arr1[ind1];
                if(ind1!=arr1.length-1) {
                    ind1++;
                }

            }
            if((ind1<arr1.length && ind2<arr2.length)&&arr2[ind2]<arr1[ind1]){
                combarray[ind]=arr2[ind2];
                if(ind2!=arr2.length-1) {
                    ind2++;
                }

            }
            ind++;
        }
        return combarray;
    }
}
