import java.util.Arrays;
import java.util.Scanner;

public class RevsaleArray {
    public static void reverse_Array(int arr[],int n){
        int i=0;
        int j=n-1;
        while(i<j){
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
          i++;
          j--;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array::");
        int n=sc.nextInt();

        int arr[]=new int[n];
        //take input as array from user
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Before Reverse Array::"+Arrays.toString(arr));
        reverse_Array(arr,n);
        System.out.println("After Reverse Array::"+Arrays.toString(arr));
    }
}
