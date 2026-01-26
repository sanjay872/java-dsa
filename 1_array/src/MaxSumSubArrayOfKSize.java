import java.util.ArrayList;
import java.util.List;

public class MaxSumSubArrayOfKSize {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,2};
        int k=2;
        System.out.println(maxSumSubArray(arr,k));
    }

    static int maxSumSubArray(int[] arr, int k){

        int p1=0,p2=0;

        int maxSum=0;

        while(p2<k){
            maxSum+=arr[p2];
            p2++;
        }

        int sum=maxSum;

        while(p2<arr.length){
            sum=sum + arr[p2] - arr[p1];
            maxSum=Math.max(maxSum,sum);
            p1++;
            p2++;
        }

        return maxSum;
    }
}
