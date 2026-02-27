package string;
import java.util.Scanner;

class ss1 {
  public static void main(String[] args){
  String S2="hello world!";
  String S3="bhavs";
  String S4="Bhavs";
  System.out.println(S2.length());//length
  System.out.println(S3.equalsIgnoreCase(S4));// case doesnt matter
  System.out.println(S3.equals(S4));//case matters 
  String myStr = "Hello,thisisjohn";
  char result = myStr.charAt(0);
  System.out.println(myStr.substring(1, 4));//SUBSTRING

System.out.println(result);
Scanner sc=new Scanner(System.in);

 System.out.println("enter the string:");
 
 String str=sc.nextLine();
System.out.println("Uppercase:"+str.toUpperCase());//prints in upper case same can be done to lower case using
//  toLowerCase()
System.out.println("concat:" +str.concat(S2));//concat
System.out.println(str.trim());//to trim the sapce before    example //input is "       its bhavs here "
//output will be "its bhavs here "



 sc.close();
}

 
}