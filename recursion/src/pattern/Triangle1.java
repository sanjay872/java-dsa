package pattern;

public class Triangle1 {
    public static void main(String[] args) {
        printWithLoop(4);
        System.out.println();
        print(4,0);
    }

    static void printWithLoop(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void print(int row, int col){
        if(row==0) return;

        if(row==col){
            System.out.println();
            print(row-1,0);
        }
        else{
            System.out.print("* ");
            print(row,col+1);
        }
    }
}
