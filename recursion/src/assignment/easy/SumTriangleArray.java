package assignment.easy;

import java.util.Arrays;

public class SumTriangleArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        print(arr);
    }

    static void print(int[] arr){
        if(arr.length==0){
            return;
        }
        int[] cur=new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            cur[i]=arr[i]+arr[i+1];
        }
        print(cur);
        System.out.println(Arrays.toString(arr));
    }


}
