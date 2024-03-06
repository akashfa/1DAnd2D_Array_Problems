import java.util.Arrays;
import java.util.Scanner;

public class RotationMatrix {
    public static void rotation_Matrix(int arr[][],int n){
    
    // Step 1: Transpose the 2D array
    for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            int temp=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
            
            
        }
    }
     // Step 2: Swap the left and right side elements
     for(int i=0;i<n;i++){
        int li=0;
        int ri=n-1;
        while(li<ri){
            int temp=arr[i][li];
            arr[i][li]=arr[i][ri];
            arr[i][ri]=temp;
            li++;
            ri--;
        }
     }
               
    

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row::");
        int n=sc.nextInt();
        

        
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Before Rotation Array::");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        rotation_Matrix(arr,n);
        
        System.out.println("After Rotation Array::");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
}
