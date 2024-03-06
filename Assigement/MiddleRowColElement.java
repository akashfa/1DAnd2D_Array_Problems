import java.util.Scanner;

public class MiddleRowColElement {
    public static void midColRowElement(int[][]arr,int n){
        int mid=n/2;
        System.out.print("Middle row: ");
  for (int j = 0; j < n; j++) {
    System.out.print(arr[mid][j] + " ");
  }
  System.out.println();

  // Print middle column elements
  System.out.print("Middle column: ");
  for (int i = 0; i < n; i++) {
    System.out.print(arr[i][mid] + " ");
  }
  System.out.println();
        } 
    
 public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Row::");
        int n=sc.nextInt();
        System.out.println("Enter the Size of Col::");
        int m=sc.nextInt();
        int arr[][]=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        midColRowElement(arr,n);
 }   
}
