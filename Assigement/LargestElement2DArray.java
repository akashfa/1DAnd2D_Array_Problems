import java.util.Scanner;

public class LargestElement2DArray {
    public static int largestElement(int[][]arr,int n,int m){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(max<arr[i][j]){
                    max=arr[i][j];
                } 
            }
        }
        return max;
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
       int max_value= largestElement(arr,n,m);
       System.out.println("This is max element in array::"+max_value);
 }   
}
