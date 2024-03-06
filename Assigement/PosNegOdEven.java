class PosNegOdEven{
    public static void posNegAndOdEeven(int[][]arr,int n){
        int pos=0, neg=0,odd=0,even=0,zero=0;
        
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int num=arr[i][j];
                if(num<0){
                  neg++;
                } else if(num>0){
                    pos++;
                  }else if(num==0){
                    zero++;
                  }
                  if(num%2==0){
                    even++;
                  }else{
                    odd++;
                  }
                
            }
         }
         System.out.println("number of Positive numbers = "+pos);
         System.out.println("number of Negitive numbers = "+neg);
         System.out.println("number of even numbers = "+even);
         System.out.println("number of Odd numbers = "+odd);
         System.out.println("number of Zero numbers = "+zero);
         
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,-3,4},{0,0,-4,2},{1,-1,2,3},{-4,-5,-7,0}};
        int n=arr.length;
       posNegAndOdEeven(arr,n);
    }
}