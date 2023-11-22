package Mountblue;

import java.util.Arrays;

// Remove the duplicates of the number in the array
public class Removeduplicates {
    public static void main (String[] args){
        int[] arr={1,2,2,3};
        int[] result=remove(arr);
        System.out.println(Arrays.toString((result)));
    }
    // using the frequency set
    static int[] remove(int[] arr){
        int n=arr.length;
        int[] result=new int[n+1];
// Find the max element in the array
        int m=0;
        for(int i=0;i<n;i++) {
            m = Math.max(m, arr[i]);
        }
        // Frequency of the element
        for(int i=0;i<n;i++){
            result[arr[i]]++;
        }
// count the numbers that are greater than zero
        int count=0;
        for(int i=0;i<n+1;i++) {
            if (result[i] > 0) {
                count++;
            }
        }
  //Storing only the unique element
        int[] arr1=new int[count];
        int index=0;
        for(int i=0;i<n+1;i++){
            if(result[i]>0){
                arr1[index++]=i;
            }
        }

        return arr1;
    }
}
