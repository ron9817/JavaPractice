import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Solution {

    // Complete the miniMaxSum function below.
    
    static long[] minMax(long arr[], int l, int h){
        if(l==h){
            return new long[] {arr[l], arr[l]};
        }
        if(h-l==1){
            if(arr[l]>arr[h]){
                return new long[] {arr[h], arr[l]};
            }
            return new long[] {arr[l], arr[h]};
        }
        int mid=(l+h)/2;
        long ansLeft[]=minMax(arr,l,mid);
        long ansRight[]=minMax(arr,mid+1,h);
        long min,max;
        if(ansLeft[0]<ansRight[0])
            min=ansLeft[0];
        else
            min=ansRight[0];
        if(ansLeft[1]>ansRight[1])
            max=ansLeft[1];
        else
            max=ansRight[1];
		
        return new long[] {min,max};
    }
    
    
    static void miniMaxSum(long[] arr) {
        long ans[] = minMax(arr,0,4);
        long min, max;
        min=ans[0];
        max=ans[1];
        long minSum=0;
        long maxSum=0;
        for(int i=0; i<5; i++){
            if(arr[i]!=min){
                System.out.println(min+" "+(arr[i]!=min)+" "+arr[i]);
				maxSum+=arr[i];
            }
            if(arr[i]!=max){
                minSum+=arr[i];
            }
        }
        System.out.print(min+" "+max+" "+minSum+" "+maxSum);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        long[] arr = new long[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            long arrItem = Long.parseLong(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
