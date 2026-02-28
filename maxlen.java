//maximum length pgm
public class maxlen {
    public static void main(String[] args) {
        int arr[]={10,12,14,7,8};
        int n = arr.length;
        int count=1;
        for(int i=1;i<n;i++){
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) ||
    (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)){
                count++;
            }
        } 
        System.out.println(count);
    }
    
}
