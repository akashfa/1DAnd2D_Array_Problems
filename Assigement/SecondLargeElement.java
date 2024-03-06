import java.util.Scanner;

public class SecondLargeElement {
    public static int fristMaxElement(int[]arr,int n){

        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
           
        }
        
       return max;
    }
    public static int secondMaxElement(int arr[],int n){
       int max= fristMaxElement(arr, n);
       int max1=Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
         if(arr[i]==max){
            arr[i]=-1;
         }
         if(max1<arr[i]){
            max1=arr[i];
         }
        
       }

       return max1;
    }
   public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array::");
        int n=sc.nextInt();

        int arr[]=new int[n]; //34 21 54 65 43
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         int val= secondMaxElement(arr, n);
         System.out.println("Second Largest Element in the array::"+val); //54
   } 
}
