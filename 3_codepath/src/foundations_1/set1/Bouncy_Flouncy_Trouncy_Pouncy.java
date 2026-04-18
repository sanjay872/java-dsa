package foundations_1.set1;
/*
* Bouncy, Flouncy, Trouncy, Pouncy
* Tigger has developed a new programming language Tiger with only four operations and one variable tigger.

    bouncy and flouncy both increment the value of the variable tigger by 1.
    trouncy and pouncy both decrement the value of the variable tigger by 1.
    Initially, the value of tigger is 1 because he's the only tigger around! Given a list of strings operations containing a list of operations, return the final value of tigger after performing all the operations.

    operations = ["trouncy", "flouncy", "flouncy"]
    final_value_after_operations(operations)

    operations = ["bouncy", "bouncy", "flouncy"]
    final_value_after_operations(operations)
*
* understand
*
* plan
* loop 0 to size of the list
*
* match
* implement
* * */

import java.util.List;

public class Bouncy_Flouncy_Trouncy_Pouncy {
    public static void main(String[] args) {

        List<String> testCase1=List.of("trouncy", "flouncy", "flouncy"); // 2

        List<String> testCase2=List.of( "flouncy", "flouncy"); // 3

        List<String> testCase3=List.of("flouncy", "pouncy", "pouncy"); // 0

        System.out.println("final value: "+final_value_after_operations(testCase1));


        System.out.println("final value: "+final_value_after_operations(testCase2));


        System.out.println("final value: "+final_value_after_operations(testCase3));
    }

    private static int final_value_after_operations(List<String> operations){
        int tigger=1;

        for(String ops:operations){
            if(ops.equals("bouncy") || ops.equals("flouncy")){
                tigger+=1;
            }
            else{
                tigger-=1;
            }
        }

        return tigger;
    }
}
