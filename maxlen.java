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


//Another wayyy- for user input 
// import java.util.*;
// public class arey {
//   public static void main(String[] args){
//      Scanner sc = new Scanner(System.in);

//         System.out.println("Enter length:");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter elements:");

//         // input loop ONLY for input
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int count=1;
//         for(int j=1;j<n;j++){
//           if(arr[j]%2==0 && arr[j-1]%2!=0||arr[j]%2!=0 && arr[j-1]%2==0){


//             count++;
//           }
//         }
//       System.out.println(count);
//   }
  
// }