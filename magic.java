public class magic {
    public static void main(String[] args){
        int  n =19;
        int sum = n;
        
        while(sum>9){ //19>9
            int temp = sum; //=19
            sum = 0;
            while(temp > 0){
                sum = sum + temp%10; // 0+9=9
                temp = temp/10; //1/10=0
            }

        }
        if(sum==1)
            System.out.println("Magic");
        else
            System.out.println("not magic");
    }
}
