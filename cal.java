import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
    // static int add(int a,int b){
    //     return a+b;
    // }
    // static int sub(int a,int b){
    //     return a-b;
    // }
    // public static void main(String[] args) {
    //     int a=10;
    //     int b=5;
    //     int res= add(a,b);
    //     int res1= sub(a,b);
    //     System.out.println(res);
    //     System.out.println(res1);
    // }
    Scanner sc = new Scanner(System.in);
        double num1, num2;
        char operator;

        // Taking input
        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();

        System.out.print("Choose operator (+, -, *, /): ");
        operator = sc.next().charAt(0);
        
        switch(operator){
            case '+':
                System.out.println("result =" +(num1 + num2));
                break;
            case '-':
                System.out.println("result= "+ (num1 - num2));
                break;
            case '*':
                System.out.println("result= "+ (num1 * num2));
                break;
            case '/':
                if(num2 != 0)
                    System.out.println("result= "+ (num1 / num2));
                else 
                    System.out.println("error");
                break;
            default:
                System.out.println("invalid operator");
        }
        sc.close();
    }
}   
    

