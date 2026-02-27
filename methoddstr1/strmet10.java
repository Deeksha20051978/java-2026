package methoddstr1;
import java.util.Scanner;

public class strmet10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Enter the input string");
        StringBuilder sb= new StringBuilder(input);
        //append
        sb.append("hehe");
        System.out.println("After append:"+sb);
        //insert
        sb.insert(1,"hoho");
        System.out.println("After insertion:"+sb);
        //replace
        sb.replace(0, 5, "begin");
        System.out.println("after replacing:"+sb);
        //delete
        sb.delete(5, 6);
        System.out.println("After deletion"+sb);
        //reverse
        sb.reverse();
        System.out.println("after reverse"+ sb);
        //length()
        
        System.out.println("Length of sb:"+sb.length());
        //charAt
        if(sb.length()>2)
            System.out.println("CharAt: "+sb.charAt(2));
        //setcharAt()
        if(sb.length()>0)
            sb.setCharAt(0, 'f');
        System.out.println("setcharat"+sb);

    sc.close();
    }
    
    
}
