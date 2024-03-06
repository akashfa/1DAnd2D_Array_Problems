import java.util.Scanner;

public class PreFixSum {
    public static void preFixSum(int arr[][],int n){
 // traversed the array row-wise to calculate the row-wise prefix sum
        for(int i=0;i<n;i++){
          for(int j=1;j<n;j++){
            arr[i][j]+=arr[i][j-1];
          }
        }
//traversed the array column-wise to calculate the column-wise prefix sum
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
              arr[i][j]+=arr[i-1][j];
            }
          }

    }
    public static int sumResion(int arr[][],int r1,int c1,int r2,int c2){
         int sum=0,up=0,left=0,repted=0,result=0;
         sum=arr[r2][c2];
         up=arr[r1-1][c2];
         left=arr[r2][c1-1];
         repted=arr[r1-1][c1-1];
         result=sum-up-left+repted;
         return sum;

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

       int r1, c1, r2, c2;

        System.out.print("Enter the value of r1 coordinate: ");
        r1 = sc.nextInt();

        System.out.print("Enter the value of c1 coordinate: ");
        c1 = sc.nextInt();

        System.out.print("Enter the value of r2 coordinate: ");
        r2 = sc.nextInt();

        System.out.print("Enter the value of c2 coordinate: ");
        c2 = sc.nextInt();
        preFixSum(arr,n);

     

         int result=sumResion(arr, 2,2,3,3);
         System.out.println("Sum of Array::"+result);
    
    
    }
}
