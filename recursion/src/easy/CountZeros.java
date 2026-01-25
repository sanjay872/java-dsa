package easy;

public class CountZeros {
    public static void main(String[] args) {
        int num=30040050;
        System.out.println(count(num,0));
    }

    static int count(int n, int c){
        if(n==0){
            return c;
        }

        int rem=n%10;

        if(rem==0){
            return count(n/10,c+1);
        }
        return count(n/10,c);
    }
}
