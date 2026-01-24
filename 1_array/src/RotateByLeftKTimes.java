import java.util.Arrays;

public class RotateByLeftKTimes {
    public static void main(String[] args) {

    /*
    *   Method1:
    *       swap elements for k time
    *       time - O(nk) space - O(1)
    *   Method2:
    *       take first k element at add it to the last of temp array
    *       take element after k and add it to the starting of temp array
    *       time - O(n) space - O(n)
    *
    *   Method3:
    *       1. reverse entire array
    *       2. reverse from 0 to k-1
    *       3. reverse from k to n-1
    *       time - O(n) space - O(1)
    *
    * */


    /*
    *   Edge Cases
    *   k negative - not allowed
    *   k zero = same array is returned
    *   k greater than array size - modules is done
    * */



        int[] arr1={1,23,41,2,3,5,89,32};
        int[] arr2={1,23,41,2,3,5,89,32};
        int[] arr3={1,23,41,2,3,5,89,32};

        int k=3;

        method1(arr1,k);
        method2(arr2,k);
        method3(arr3,k);
    }

    static void method1(int[] arr, int k){
        int n=arr.length;
        k=k%n;

        while(k>0){

            int first=arr[0];

            for(int i=1;i<n;i++){
                arr[i-1]=arr[i];
            }

            arr[n-1]=first;
            k--;
        }

        System.out.println("Rotate left by method 1: "+ Arrays.toString(arr));
    }

    static void method2(int[] arr, int k){
        int n=arr.length;
        int[] temp=new int[n];

        k=k%n;
        int index=0;

        for(int i=k;i<n;i++){
            temp[index++]=arr[i];
        }

        for(int i=0;i<k;i++){
            temp[index++]=arr[i];
        }

        System.out.println("Rotate left by method 2: "+Arrays.toString(temp));
    }

    static void method3(int[] arr, int k){
        int n=arr.length;

        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);

        System.out.println("Rotate left by method 3: "+Arrays.toString(arr));
    }

    static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }
}
