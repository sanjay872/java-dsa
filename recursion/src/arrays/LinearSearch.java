package arrays;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,33,22,33,5};
        int target=33;

        System.out.println("Is target exist: "+find(arr,target,0));
        System.out.println("what the index is? "+findIndex(arr,target,0));
        System.out.println("what is the last index? "+findLastIndex(arr,target,arr.length-1));
        findAllIndex(arr,target,0);
        System.out.println("Find all index: "+ list.toString());
    }

    static boolean find(int[] arr, int target, int index){
        if(index==arr.length) return false;
        if(arr[index]==target) return true;
        return find(arr,target,index+1);
    }

    static int findIndex(int[] arr, int target, int index){
        if(index==arr.length) return -1;
        if(arr[index]==target) return index;
        return findIndex(arr,target,index+1);
    }

    static int findLastIndex(int[] arr, int target, int index){
        if(index==0) return -1;
        if(arr[index]==target) return index;
        return findLastIndex(arr,target,index-1);
    }

    static List<Integer> list=new ArrayList<>();

    static void findAllIndex(int[] arr, int target, int index){
        if(index==arr.length) return;
        if(arr[index]==target) list.add(index);
        findAllIndex(arr,target,index+1);
    }

}
