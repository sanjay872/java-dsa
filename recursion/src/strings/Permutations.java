package strings;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        String str="abc";
        getPermutation("",str);
        System.out.println("The res is: "+getPermutationReturn("",str));
        System.out.println("The no of Permutations: "+findCountOfPermutation("",str));
    }

    static void getPermutation(String res, String str){
        if(str.isEmpty()){
            System.out.println(res);
            return;
        }

        char ch=str.charAt(0);

        for(int i=0;i<=res.length();i++){
            String left=res.substring(0,i);
            String right=res.substring(i);
            getPermutation(left+ch+right,str.substring(1));
        }
    }

    static List<String> getPermutationReturn(String res, String str){

        List<String> lst=new ArrayList<>();

        if(str.isEmpty()){
            lst.add(res);
            return lst;
        }

        char ch=str.charAt(0);

        for(int i=0;i<=res.length();i++){
            String left=res.substring(0,i);
            String right=res.substring(i);
            List<String> other=getPermutationReturn(left+ch+right,str.substring(1));
            lst.addAll(other);
        }
        return lst;
    }

    static int findCountOfPermutation(String res, String str){
        if(str.isEmpty()){
            return 1;
        }

        char ch=str.charAt(0);

        int count=0;

        for(int i=0;i<=res.length();i++){
            String left=res.substring(0,i);
            String right=res.substring(i);
            count+=findCountOfPermutation(left+ch+right,str.substring(1));
        }
        return count;
    }
}
