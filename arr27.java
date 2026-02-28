//non-repeating number importanttttttttttttt pgmmmmmmmmmmmmmm!!!!!!!!!!!!!!!!!!
public class arr27 {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,3,2,1};
        int n = arr.length;
        int res = 0;

        for(int i = 0; i < n; i++){
            res = res ^ arr[i];
        }
    
        System.out.println("Non-repeating element: " + res);
    }
}
