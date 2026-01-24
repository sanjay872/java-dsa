package easy;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(1342));
        System.out.println(product(123));
    }

    static int sum(int num){
        if(num==0) return 0;
        return num%10 + sum(num/10);
    }

    static int product(int num){
        if(num%10==num) return num;
        return num%10 * product(num/10);
    }
}
