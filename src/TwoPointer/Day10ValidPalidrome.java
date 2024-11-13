package TwoPointer;

public class Day10ValidPalidrome {

    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int end = s.length() - 1;

        while (start <= end) {
            int currentFirst = s.charAt(start);
            int currentLast = s.charAt(end);

            if (!Character.isLetterOrDigit(currentFirst)) {
                start++;
            } else if (!Character.isLetterOrDigit(currentLast)) {
                end--;
            } else {
                if (Character.toLowerCase(currentFirst) != Character.toLowerCase(currentLast)) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
