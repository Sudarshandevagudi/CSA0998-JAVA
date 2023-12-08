import java.util.Scanner;

class matrixmultiplication{
    public static void main(String[] args ){
        Scanner s=new Scanner(System.in);
        int n;
        
        System.out.println("enter the number of matrices :\t ");
        n=s.nextInt();
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int[][] c = new int[n][n];
        System.out.println("enter the matrices : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("enter the matrices : ");
        for( int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                b[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    c[i][j] += a[i][k] * b[j][k];
                }
            }
        }
        System.out.println("result is : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println(c[i][j] + " ");
            }
        }
        
    }
}
