import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        /*
        *   Method 1:
        *       using linked hash set to get all non duplicated
        *       using a new array to store the result
        *
        *       time - O(n) space - O(n)
        *
        *   Method 2:
        *       using two pointers
        *       if both the pointers are same move, one pointer forward till it becomes false;
        *       add the value of forward pointer at the next position of slow pointer.
        *       move slow pointer
        *
        *       time - O(n) space - O(1)
        * */

        /*
        *
        *   Edge cases
        *   no duplicates
        *   all duplicates
        * */

        int[] arr1={1,1,1,3,3,6,7,7,7,8,9};
        int[] arr2={1,2,2,3,3,3,6,7,7,8,8,9};

        method1(arr1);
        method2(arr2);
    }

    static void method1(int[] arr){
        Set<Integer> set=new LinkedHashSet<>();

        for(int a:arr){
            set.add(a);
        }

        int[] temp=new int[set.size()];

        int index=0;

        for(int s:set){
            temp[index++]=s;
        }

        System.out.println("Removed Duplicates using Method 1: "+ Arrays.toString(temp));
    }

    static void method2(int[] arr){
        int p1=0,p2=0;

        while(p2<arr.length){
            while(p2<arr.length&&arr[p1]==arr[p2]){
                p2++;
            }
            if(p2<arr.length){
                arr[p1+1]=arr[p2];
            }
            p1++;
        }

        System.out.println("Removed Duplicates using Method 2: "+ Arrays.toString(arr));
    }
}
