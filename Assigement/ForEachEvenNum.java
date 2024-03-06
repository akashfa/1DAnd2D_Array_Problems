import java.util.Scanner;

public class ForEachEvenNum {
    public static void evenElement(int arr[],int n){
        for(int value:arr){
            if(value%2==0){
                System.out.println(value);//34 54
                

            }
        }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array::");
        int n=sc.nextInt();

        int arr[]=new int[n]; //34 21 54 65 43
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       evenElement(arr,n);
    }
}
