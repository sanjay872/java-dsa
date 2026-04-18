package foundations_1.set1;

/*
*
*

T-I-Double Guh-Er: That spells Tigger! Write a function tiggerfy() that accepts a string word and returns a new string that removes any substrings t, i, gg, and er from word.
The function should be case insensitive.
*
*
* understanding
* - I need to create a function which is called tiggerfy()
* - function accepts a input as string
* - what I need to do is, remove substring which are t, i, gg, and er
*
* - if character in input or if no substring present, return the original string
*
* plan
    - create a set for avoiding duplicates
    - loop though set, see if any one of the value is present on the string
        - I would replace with empty string
     - end of loop, return string
*
* */

import java.util.List;

public class T_1_Double_Guh_Er_2 {
    public static void main(String[] args) {
        String testcase1="r"; // r
        String testcase2="eggplant"; // eplant
        String testcase3="tigger"; // ""

        System.out.println(tiggerfy(testcase1));

        System.out.println(tiggerfy(testcase2));

        System.out.println(tiggerfy(testcase3));
    }

    private static String tiggerfy(String str){
        List<String> substrings=List.of("t","i","gg","er");

        for (String subString:substrings){
            str=str.replace(subString,"");
        }

        return str;
    }
}
