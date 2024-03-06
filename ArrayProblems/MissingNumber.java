import java.util.Scanner;

class MissingNumber{
    public static int missing_num(int arr[],int n){
        int sum=0;
    
        for(int i=0;i<n;i++){
            sum+=arr[i];
            
        }
        int nSum=n*(n+1)/2;

        if(sum!=nSum){
        int natrulNumberSum=(n+1)*(n+2)/2;
        return natrulNumberSum-sum;
        }
        return -1;


    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,8};
        int n=arr.length;
       int number= missing_num(arr,n);
       System.out.println("Missing number is:: "+number);
    }
}