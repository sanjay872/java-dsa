package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        System.out.println("Before Sorting: "+Arrays.toString(arr));
        sort(arr,0,arr.length-1);
        System.out.println("After Sorting: "+ Arrays.toString(arr));;
    }

    static void sort(int[] arr, int start, int end){
        if(start>=end){
            return;
        }

        int mid=start+(end-start)/2;

        int pivot=arr[mid];

        int s=start;
        int e=end;

        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while (arr[e]>pivot){
                e--;
            }

            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }

        // doing the other two half
        sort(arr,start,e);
        sort(arr,s,end);
    }
}
