public class happy {
    public static void main(String[] args) {
        int n = 79;
        
        int temp = n;
        while(temp!=1 && temp!=4){
            int sum = 0;
            while(temp>0){
                int digit =temp%10;
                sum = sum + digit*digit;
                temp = temp /10;
            }
            temp =sum;
        }// if the above code is false we check for sum==1
        if(temp ==1)
            System.out.println("happy number");
        else
            System.out.println("not happy");

         

    }
}

