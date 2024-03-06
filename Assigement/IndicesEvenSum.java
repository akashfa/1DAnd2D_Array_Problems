import java.util.Scanner;
class IndicesEvenSum{
    public static int indexEvenSum(int arr[],int n){
        int sum=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
            sum+=arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array::");
        int n=sc.nextInt();

        int arr[]=new int[n]; //3 20 4 6 9
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       int indexSum= indexEvenSum(arr,n);
       System.out.println("Even index of sum::"+indexSum);//Even index of sum::16

    }
}