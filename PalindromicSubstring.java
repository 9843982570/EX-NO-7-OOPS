
package palindromicsubstring;
import java.util.ArrayList;
import java.util.Scanner;

public class PalindromicSubstring {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        ArrayList<String> palindromes = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String sub = input.substring(i, j);
                if (isPalindrome(sub) && sub.length() > 1) {
                    palindromes.add(sub);
                }
            }
        }

        System.out.println("Palindromic substrings found: ");
        for (int i = 0; i < palindromes.size(); i++) {
            System.out.println((i + 1) + ". " + palindromes.get(i));
        }
        System.out.println("Total palindromic substrings: " + palindromes.size());
    }

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
}



