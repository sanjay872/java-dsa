package strings;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        String str="abc";
        List<String> res=new ArrayList<>();
        getSubset(str,"",res);
        System.out.println("The subset is :"+res);
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
}
