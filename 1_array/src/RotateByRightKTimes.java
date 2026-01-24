import java.util.Arrays;

public class RotateByRightKTimes {
    public static void main(String[] args) {
        /*
         *   Method 1:
         *       Swap all elements to right for K times.
         *       time - O(kn) space - O(1)
         *
         *   Method 2:
         *       Copy elements into a new array at rotated positions.
         *       temp[(i+k)%n] = arr[i]
         *       time - O(n) space - O(n)
         *
         *   Method 3:
         *       In place reverse
         *       1. reverse the entire list
         *       2. reverse from 0 to k-1.
         *       2. reverse from k to n-1
         *
         *       it works because [A | B] → reverse → [reverse(B) | reverse(A)]
         *
         *       time - O(n) space - O(1)
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

        k=k%arr.length;

        while(k>0){
            int last=arr[arr.length-1];
            for(int i=arr.length-1;i>0;i--){
                arr[i]=arr[i-1];
            }
            arr[0]=last;
            k--;
        }
        System.out.println("Rotated to right with Method 1: "+Arrays.toString(arr));
    }


    static void method2(int[] arr, int k){

        int n=arr.length;
        int[] temp=new int[n];

        for(int i=0;i<n;i++){
            temp[(i+k)%n]=arr[i];
        }

        System.out.println("Rotated to right with Method 2: "+Arrays.toString(temp));
    }


    static void method3(int[] arr, int k){

        reverseArray(arr,0,arr.length-1);
        reverseArray(arr,0,k-1);
        reverseArray(arr,k,arr.length-1);

        System.out.println("Rotated to right with Method 3: "+Arrays.toString(arr));
    }

    static void reverseArray(int[] arr, int start, int end){
        while(start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
