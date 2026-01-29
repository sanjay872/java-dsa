package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        System.out.println("Before Sorting: "+Arrays.toString(arr));
        arr=sort(arr);
        System.out.println("After Sorting: "+Arrays.toString(arr));
    }

    static int[] sort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=sort(Arrays.copyOfRange(arr,0,mid));
        int[] right=sort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    static int[] merge(int[] left, int[] right){
        int leftIndex=0,rightIndex=0;

        int[] res=new int[left.length+right.length];
        int i=0;

        while(leftIndex<left.length&&rightIndex<right.length){
            if(left[leftIndex]<right[rightIndex]){
                res[i]=left[leftIndex];
                leftIndex++;
            }
            else{
                res[i]=right[rightIndex];
                rightIndex++;
            }
            i++;
        }

        while(leftIndex<left.length){
            res[i]=left[leftIndex];
            i++;
            leftIndex++;
        }

        while(rightIndex<right.length){
            res[i]=right[rightIndex];
            i++;
            rightIndex++;
        }

        return res;
    }
}
