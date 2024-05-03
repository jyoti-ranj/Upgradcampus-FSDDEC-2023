import java.util.Scanner;

public class LongestSubstringLength {

    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (allUnique(s, i, j)) {
                    maxLength = Math.max(maxLength, j - i);
                }
            }
        }

        return maxLength;
    }

    public static boolean allUnique(String s, int start, int end) {
        boolean[] visited = new boolean[256];
        for (int i = start; i < end; i++) {
            char ch = s.charAt(i);
            if (visited[ch]) {
                return false;
            }
            visited[ch] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        int longestLength = lengthOfLongestSubstring(input);
        System.out.println("Length of the longest substring without repeating characters: " + longestLength);
    }
}
