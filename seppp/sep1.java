
package seppp;
import java.util.Scanner;
public class sep1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Enter the input string");
        StringBuilder letters= new StringBuilder(input);
        StringBuilder numbers=new StringBuilder();
        //logic
        for(char ch:input.toCharArray()){
            if(Character.isLetter(ch)){
                letters.append(ch);
            }
            else if(Character.isDigit(ch)){
                numbers.append(ch);
            }

        }
        System.out.println(letters);
        System.out.println(numbers);
}
}