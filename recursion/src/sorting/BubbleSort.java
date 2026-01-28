package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr1={4,3,1,6,2,5};
        int[] arr2={4,3,1,6,2,5};
        sortWithLoop(arr1);
        sort(arr2,arr2.length-1,0);
        System.out.println("Bubble sort with recursion: "+Arrays.toString(arr2));
    }

    static void sortWithLoop(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Bubble sort with loop: "+ Arrays.toString(arr));
    }

    static void sort(int[] arr, int row, int col){
        if(row==0){
            return;
        }

        if(col<row){
            if(arr[col]>arr[col+1]){
                int temp=arr[col];
                arr[col]=arr[col+1];
                arr[col+1]=temp;
            }
            sort(arr,row,col+1);
        }
        else{
            sort(arr,row-1,0);
        }
    }
}
