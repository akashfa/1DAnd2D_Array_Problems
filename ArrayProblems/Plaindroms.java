import java.util.Scanner;
class Plaindroms{
    public static boolean plaindromFind(int arr[],int n){
         int i=0;
         int j=n-1;
         while(i<=j){
            if(arr[i]!=arr[j]){
                return false;
            }
            i++;
            j--;
         }
         return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of plaindrom::");
        int n=sc.nextInt();

        int arr[]=new int[n];
        //take input as array from user
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
      boolean flage=  plaindromFind(arr,n);
        if(!flage) System.out.println("This is not plaindrom");
        else System.out.println("This is plaindrom");
    }
}