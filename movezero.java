//pgm to move zeros to end 

class movezero{
    public static void main(String[]args){
        int arr[]={1,2,0,0,1,3};
        int n = arr.length;
        int rev[]=new int[n];
        int index=0;
        for(int i=0;i<n;i++){
            if (arr[i] ==0){
                rev[index++]=arr[i];
            }
        }
        while(index<n){
            rev[index++]=0;
        }
        for(int i=0; i<n;i++){
            System.out.print(rev[i] +" ");
        }

    }
}