import java.util.Scanner;

public class MatrixDiagonalSum {
    
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                arr[i][j] = sc.nextInt();

                                 // |\
        int sum1=diaganal1(arr); // |_\


        int sum2=diaganal2(arr); // /|
                                // /_|

        if(sum1 > sum2)
            System.out.println(sum1);
        else    
            System.out.println(sum2);
    }

    public static int diaganal1(int[][] arr){
        int n = arr.length, sum=0;
        for(int i=0;i<n;i++)
            for(int j=0;j<n-i-1;j++)
                sum+=arr[i][j];

        return sum; 
    }

    public static int diaganal2(int[][] arr){
        int n = arr.length, sum=0;

        for(int i=0;i<n;i++)
            for(int j=n-i-1;j<n;j++)
                sum+=arr[i][j];

        return sum;
    }
}
