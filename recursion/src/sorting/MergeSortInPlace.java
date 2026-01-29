package sorting;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        System.out.println("Before sorting in-place: "+ Arrays.toString(arr));
        sort(arr,0,arr.length);
        System.out.println("After sorting in-place: "+Arrays.toString(arr));
    }

    static void sort(int[] arr, int start, int end){
        if(end-start==1){
            return;
        }

        int mid=start+(end-start)/2;

        sort(arr,start,mid);
        sort(arr,mid,end);

        merge(arr,start,mid,end);
    }

    static void merge(int[] arr,int start, int mid, int end){
        int[] mix=new int[end-start];

        int i=start;
        int j=mid;

        int index=0;

        while(i<mid&&j<end){
            if(arr[i]<arr[j]){
                mix[index]=arr[i];
                i++;
            }
            else{
                mix[index]=arr[j];
                j++;
            }
            index++;
        }

        while(i<mid){
            mix[index]=arr[i];
            index++;
            i++;
        }

        while(j<end){
            mix[index]=arr[j];
            index++;
            j++;
        }

        for(int k=0;k<mix.length;k++){
            arr[start+k]=mix[k];
        }
    }
}
