import java.util.Arrays;

public class MoveZeroesToEnd {

    public static void main(String[] args) {
        /*
        *   Method1:
        *       create new array
        *       traverse though the given array and add all the number that is not zero into the number array.
        *       time - O(n) space - O(n)
        *
        *   Method2:
        *       using two pointer
        *       one moves till it reaches a number that is not zero
        *       other one stop at zero
        *       swap them
        *       time - O(n) space - O(1)
        * */

        /*
        *   Edge cases
        *   no zeros
        *   all zeros
        *   negative values
        *   empty array
        * */

        int[] arr1={1,2,0,3,4,0,0,5,6};
        int[] arr2={0,1,0,2,-4,0,0,5,6};

        method1(arr1);
        method2(arr2);
    }

    static void method1(int[] arr){
        int[] temp=new int[arr.length];

        int index=0;

        for (int j : arr) {
            if (j != 0)
                temp[index++] = j;
        }

        System.out.println("Moved Zeros using Method 1: "+Arrays.toString(temp));
    }

    static void method2(int[] arr){
        int p1=0,p2=0;

        while(true){
            while(p1<arr.length&&arr[p1]!=0){
                p1++;
            }
            while(p2<arr.length&&arr[p2]==0){
                p2++;
            }

            if(p1<arr.length&&p2<arr.length){
                int temp=arr[p1];
                arr[p1]=arr[p2];
                arr[p2]=temp;
            }
            else{
                break;
            }
        }

        System.out.println("Moved Zeros using method 2: "+Arrays.toString(arr));
    }
}
