package strings;

import java.util.ArrayList;
import java.util.List;

public class DigitCombinations {
    public static void main(String[] args) {
        getCombinations("12","");
        System.out.println("The result is: "+getCombinationsReturn("12",""));
        System.out.println("Get count: "+getCombinationsCount("12",""));
    }

    static void getCombinations(String str, String cur){
        if(str.isEmpty()){
            System.out.println(cur);
            return;
        }
        int digit=str.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            getCombinations(str.substring(1),cur+((char)('a'+i)));
        }
    }

    static List<String> getCombinationsReturn(String str, String cur){
        List<String> res=new ArrayList<>();
        if(str.isEmpty()){
            res.add(cur);
            return res;
        }
        int digit=str.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            List<String> down=getCombinationsReturn(str.substring(1),cur+((char)('a'+i)));
            res.addAll(down);
        }
        return res;
    }


    static int getCombinationsCount(String str, String cur){
        if(str.isEmpty()){
            return 1;
        }
        int count=0;
        int digit=str.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            count+=getCombinationsCount(str.substring(1),cur+((char)('a'+i)));
        }
        return count;
    }
}
