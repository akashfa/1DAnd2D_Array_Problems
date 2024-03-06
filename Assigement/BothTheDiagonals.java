import java.util.Scanner;

public class BothTheDiagonals {
    public static void bothTheDiagonalsValue(int [][]arr,int n){

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i+j)%2==0){
                    System.out.print(arr[i][j]+" ");
                }
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
        if(n%2!=0){
        bothTheDiagonalsValue(arr,n);
        }else{
            System.out.println("Enter the size of array odd::");
        }
    }
}
