import java.util.Scanner;

public class CountWordsCharactersVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a line: ");
        String line = sc.nextLine();
        
        int words = 0;
        int characters = 0;
        int vowels = 0;
        
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            
            if (c != ' ') {
                characters++;
                
                if (isVowel(c)) {
                    vowels++;
                }
            }
            
            if ((i == 0 && c != ' ' )||( i > 0 && c != ' ' && line.charAt(i - 1) == ' ')) {
                words++;
            }
        }
        
        System.out.println("Words: " + words);
        System.out.println("Characters: " + characters);
        System.out.println("Vowels: " + vowels + "\n");
    }
    
    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}