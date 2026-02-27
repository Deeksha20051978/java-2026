//sample input :"banana" target = a, output 3 count the occurence
public class bann {
    public static void main(String[] args) {
        
        String s="banana";
        int count=1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='a'){
                count++;
            }
        }
        
        System.out.println(count);
        

        }

        }