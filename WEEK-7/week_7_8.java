import java.util.Scanner;
public class week_7_8 {
 public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first word: ");
            String s1 = sc.nextLine();
            System.out.print("Enter second word: ");
            String s2 = sc.nextLine();
            // Remove spaces and convert to lowercase
            s1 = s1.replaceAll("\\s", "").toLowerCase();
            s2 = s2.replaceAll("\\s", "").toLowerCase();
            // If lengths are different, not an anagram
            if (s1.length() != s2.length()) {
                System.out.println("Not an Anagram");
                return;
            }
            // Count characters
            int[] count = new int[26]; // only for a–z
            for (char c : s1.toCharArray()) {
                count[c - 'a']++;
            }
            for (char c : s2.toCharArray()) {
                count[c - 'a']--;
            }
            // Check if all counts are 0
            for (int i : count) {
                if (i != 0) {
                    System.out.println("Not an Anagram");
                    return;
                }
            }
            System.out.println("It is an Anagram");
        }
    }
