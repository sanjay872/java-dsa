import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        /*
        *   Method 1:
        *       create a new array with size of existing array
        *       traverse the existing array from last and add the elements into new array
        *       time - O(n) and space - O(n)
        *   Method 2:
        *       use two pointers, place one at the start and other at the end of array.
        *       swap the value of element at the start and end positions.
        *       move both pointers.
        *       time - O(logn) and space - O(1)
        * */

        /*
        *   Edge cases
        *   empty array - loop won't run
        *   all same value - loop will still run
        *   all negative value - still works
        * */

        int[] arr={1,3,4,5,12,51,55};

        method1(arr);
        method2(arr);
    }

    static void method1(int[] arr){
        int[] arr2=new int[arr.length];
        int index=0;

        for(int i=arr.length-1;i>=0;i--){
            arr2[index++]=arr[i];
        }

        System.out.println("Reversed array using method 1: "+ Arrays.toString(arr2));
    }

    static void method2(int[] arr){

        int start=0, end=arr.length-1;

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }

        System.out.println("Reversed array using method 2: "+ Arrays.toString(arr));
    }
}
