import java.util.Scanner;

public class SecondaryDiagonalEle {
    public static void secondaryDiagonalValue(int[][]arr,int n){

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array::");
        int n=sc.nextInt();

        int arr[][]=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        secondaryDiagonalValue(arr,n);
    }
}
