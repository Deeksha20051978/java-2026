public class armstrong {
    public static void main(String[] args){
        int n = 153;
        int count = 0;
        double sum = 0;
        int temp=n;
        
        
        while(temp>0){
            count++;
            temp = temp/10;
        }
        //power of digits
        temp = n; // restoring num into temp variable
        while(temp>0){
            int digit = temp % 10; //to extract digit temp value=153 if cond true we extract rem = 3
            sum = sum + Math.pow(digit,count); //count = 3  now 3^3
            temp = temp/10; //to update the variable go to temp%10 
        }
        //condition to check if its armstrong
        if(sum == n)
            System.out.println("Armstrong");
        else 
            System.out.println("Not a armstrong no.");
    }
}
