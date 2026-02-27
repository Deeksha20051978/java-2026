//sample input = "java is easy" output = 3 , counting of words from the given string

public class cntt {
    public static void main(String[] args) {
        String input = "java is easy";
        
        if (input == null || input.trim().isEmpty()) {
            System.out.println(0);
        } else {
            String[] words = input.trim().split("\\s+");
            System.out.println(words.length);
        }
    }
}
    

