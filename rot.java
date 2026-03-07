//rotation of array by 1 position anitclockwise
public class rot {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n = arr.length;
        int rotated[]= new int[n];
        int last =arr[0];
        for(int i=0;i<n-1;i++){
            rotated[i]=arr[i+1];
        }
        rotated[n-1]=last;
        for (int i = 0; i < n; i++) {
            System.out.print(rotated[i]+" ");
            
        }}

    }

