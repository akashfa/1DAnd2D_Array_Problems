import java.util.Scanner;

public class MaxElement {
    public static int maxElement(int[]arr,int n){

        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
           
        }
        return max;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array::");
        int n=sc.nextInt();

        int arr[]=new int[n]; //34 21 54 65 43
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
     int val=  maxElement(arr,n);
     System.out.println("Maximum Element in the array::"+val); //65
    }
}
