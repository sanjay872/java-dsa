package strings;

import java.util.ArrayList;
import java.util.List;

public class RollADiceGetASum {
    public static void main(String[] args) {
        findCombo(new ArrayList<>(),0,4);
    }

    static void findCombo(List<Integer> res, int cur, int sum){
        if(sum==cur){
            System.out.println(res);
            return;
        }

        if(cur>sum){
            return;
        }

        for(int i=1;i<=sum;i++){
            res.add(i);
            findCombo(res,cur+i,sum);
            res.removeLast();
        }
    }
}
