package easy;

public class ReverseDigit {

    public static void main(String[] args) {
        rev1(12345);
        System.out.println(sum);

        int digit=12345;

        int digits=(int)(Math.log10(digit))+1;
        System.out.println(rev2(digit,digits));
    }

    static int sum=0;

    static void rev1(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        rev1(n/10);
    }

    static int rev2(int n, int c){
        if(n==0){
            return 0;
        }
        int rem=n%10;
        return (int) (rem * Math.pow(10,c-1) + rev2(n/10,c-1));
    }
}
