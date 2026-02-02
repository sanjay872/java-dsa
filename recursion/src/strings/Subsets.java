package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        String str="abc";
        List<String> res=new ArrayList<>();
        getSubset(str,"",res);
        System.out.println("The subset is :"+res);

        System.out.println("The subset is: "+getSubsetWithoutResArg(str,""));

        System.out.println("The subset is: "+getSubsetWithLoops(new int[]{1,2,3}));

        System.out.println("The subset without duplicate: "+getSubsetWithLoopsWithoutDuplicates(new int[]{2,1,2}));
    }

    static void getSubset(String str, String cur, List<String> res){
        if(str.isEmpty()){
            res.add(cur);
            return;
        }

        char ch=str.charAt(0);
        getSubset(str.substring(1),cur+ch,res);
        getSubset(str.substring(1),cur,res);
    }

    static List<String> getSubsetWithoutResArg(String str, String cur){
        List<String> res=new ArrayList<>();

        if(str.isEmpty()){
            res.add(cur);
            return res;
        }

        char ch=str.charAt(0);

        List<String> leftSubSet=getSubsetWithoutResArg(str.substring(1),cur+ch);
        List<String> rightSubSet=getSubsetWithoutResArg(str.substring(1), cur);

        res.addAll(leftSubSet);
        res.addAll(rightSubSet);

        return res;
    }

    static List<List<Integer>> getSubsetWithLoops(int[] arr){
        List<List<Integer>> res=new ArrayList<>();

        // time is O(n*2^n)

        // space is

        res.add(new ArrayList<>());

        for (int k : arr) { // O(n)

            int n = res.size();

            for (int j = 0; j < n; j++) { // O(2^n)
                List<Integer> temp = new ArrayList<>(res.get(j));
                temp.add(k);
                res.add(temp);
            }
        }

        return res;
    }

    static List<List<Integer>> getSubsetWithLoopsWithoutDuplicates(int[] arr){
        List<List<Integer>> res=new ArrayList<>();

        Arrays.sort(arr);

        // time is O(n*2^n)

        // space is

        res.add(new ArrayList<>());

        int prevEnd=0;

        for (int i=0;i<arr.length;i++) { // O(n)

            int n = res.size();
            int start=0;

            if(i>0&&arr[i]==arr[i-1]){
                start=prevEnd;
            }

            for (int j = start; j < n; j++) { // O(2^n)
                List<Integer> temp = new ArrayList<>(res.get(j));
                temp.add(arr[i]);
                res.add(temp);
            }
            prevEnd=n;
        }

        return res;
    }
}
