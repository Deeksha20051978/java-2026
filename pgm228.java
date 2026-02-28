class pgm228{
    public static void main(String[]args){
        int arr[]={1,0,1,0,1,0};
        int n = arr.length;
        int rev[]=new int[n];
        int index=0;
        for(int i=0;i<n;i++){
            if (arr[i] ==0){
                rev[index++]=arr[i];
            }
        }
        while(index<n){
            rev[index++]=1;
        }
        for(int i=0; i<n;i++){
            System.out.print(rev[i] +" ");
        }

    }
}