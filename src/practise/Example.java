package practise;
import java.util.Scanner;
import java.util.Stack;

public class Example {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int  min =  Integer.MAX_VALUE, max =  arr[0];
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = 0; j < arr.length; j++)
            {
                if (i == j) {
                    continue;
                }else
                {
                    sum = sum + arr[j];
                }
            }
            System.out.println(sum);
            if(sum<min){
                min=sum;
            }


            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(min + " " + max);
    }
}








