import java.util.Scanner;

public class FristPeakElement {
    public static int fristPeakElement(int arr[],int n){
        
         
        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
                return arr[i];
            }
        }
      return -1;
    }
   public static void main(String[] args) {
     
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array::");
        int n=sc.nextInt();

        int arr[]=new int[n]; //1 4 7 3 2 6 5
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         int val= fristPeakElement(arr, n);
         System.out.println("Frist peak Element::"+val);//7
   } 
}
