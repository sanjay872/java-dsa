package foundations_1.set1;
/*
*
* Hunny Hunt
* Problem Statement
* Write a function linear_search() to help Winnie the Pooh locate his lost items.
* The function accepts a list items and a target value as parameters.
* The function should return the first index of target in items, and -1 if target is not in items. Do not use any built-in functions.
*
* Understand
* - I need to create a linear_search function
* - input will be list of items and a target
* - if item is found on the list return the index, if not return -1
*
* Questions:
* will there be empty input?
* what is the datatype of items?
* is the items sorted?
*
* Match
* linear_search
*
* Plan
* - have loop to traverse through the list from the start till I find the target or end of the list
* - if I find the target, will return the index
* - if not return -1
*
* Implementation
*  looping from 0 to size of list -1
*       if found a element, return index
*  return -1

* */

import java.util.ArrayList;
import java.util.List;

public class HunnyHunt {
    public static void main(String[] args) {
        List<Integer> testCase1=List.of(1,2,3,4,5,6,7,8,9); // index 6
        List<Integer> testCase2=List.of(-1,2,-2,7,-7); // index 3
        List<Integer> testCase3=new ArrayList<>(); // -1
        List<Integer> testCase4=List.of(-1,2,4,5,6,8); // -1

        int testTarget=7;

        System.out.println("Found element in testcase1 at index: "+linear_search(testCase1,testTarget));
        System.out.println("Found element in testcase2 at index: "+linear_search(testCase2,testTarget));
        System.out.println("Found element in testcase3 at index: "+linear_search(testCase3,testTarget));
        System.out.println("Found element in testcase4 at index: "+linear_search(testCase4,testTarget));
    }

    private static int linear_search(List<Integer> list, int target){

        // O(n) - because let consider the size of the list is n
        for(int index=0;index<list.size();index++){
            if(list.get(index).equals(target)) { // O(1)
                return index;
            }
        }
        return -1;

        // time complexity is O(n)
        // space complexity is O(1)
    }
}
