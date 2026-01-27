package arrays;

import java.util.ArrayList;
import java.util.List;

public class FindAllIndexWithoutResInArgs {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,8};
        int target=4;

        System.out.println("Found Index: "+getAllIndex(arr,target,0).toString());
    }

    static List<Integer> getAllIndex(int[] arr, int target, int index){
        List<Integer> res=new ArrayList<>();
        if(index==arr.length) return res;
        if(arr[index]==target) res.add(index);

        List<Integer> prevCall=getAllIndex(arr,target,index+1);

        if(!prevCall.isEmpty()){
            res.addAll(prevCall);
        }

        return res;
    }
}
