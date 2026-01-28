package pattern;

public class Triangle2 {
    public static void main(String[] args) {
        printWithLoop(4);
        print(4,0);
    }

    static void printWithLoop(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void print(int row, int col){
        if(row==0){
            return;
        }

        if(col<row){
            print(row,col+1);
            System.out.print("*");
        }
        else{
            print(row-1,0);
            System.out.println();
        }
    }
}
