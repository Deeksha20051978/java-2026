public class pgm28 {
    public static void main(String[] args) {
        int arr[]={10,12,14,7,8};
        int n = arr.length;
        int rev[]= new int[n];
        
        for(int i=1;i<n;i++){
           rev[i]= arr[n-1-i];
        } 
        for(int i=0;i<n;i++){
        System.out.println(rev[i]+" ");
        }
        int sum=0;
        for (int i = 0; i < n; i++) {
            if(i%2==0){
                sum=sum+rev[i];
            }
        }
        System.out.println(sum);
       
    }
    
}