package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr1={4,3,1,5,2,6,0};
        int[] arr2={4,3,1,5,2,6,0};
        sortWithLoop(arr1);
        System.out.println("Selection Sort with Loop: "+ Arrays.toString(arr1));
        sort(arr2,arr2.length-1,0,-1,Integer.MIN_VALUE);
        System.out.println("Selection Sort with: "+ Arrays.toString(arr2));
    }

    static void sortWithLoop(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            int maxIndex=-1;
            int maxValue=arr[i];
            for(int j=0;j<i;j++){
                if(maxValue<arr[j]){
                    maxValue=arr[j];
                    maxIndex=j;
                }
            }
            if(maxIndex>=0){
                int temp=arr[i];
                arr[i]=arr[maxIndex];
                arr[maxIndex]=temp;
            }
        }
    }

    static void sort(int[] arr, int row, int col, int maxIndex, int maxValue){
        if(row==0){
            return;
        }

        if(col<row){
            if(maxValue<arr[col]){
                sort(arr,row,col+1,col,arr[col]);
            }
            else{
                sort(arr,row,col+1,maxIndex,maxValue);
            }
        }
        else{
            if(maxIndex>=0){
                int temp=arr[row];
                arr[row]=arr[maxIndex];
                arr[maxIndex]=temp;
            }
            sort(arr,row-1,0,-1,Integer.MIN_VALUE);
        }
    }
}
