package arrays;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6,7};
        int[] arr2={1,2,4,3,5,6,7};

        System.out.println("Is Array Sorted: "+isSorted(arr1,0));
        System.out.println("Is Array Sorted: "+isSorted(arr2,0));
    }

    static boolean isSorted(int[] arr, int index){
        if(index==arr.length-1) return true;
        return arr[index]<arr[index+1] && isSorted(arr,index+1);
    }
}
