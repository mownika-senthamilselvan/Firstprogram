package Mountblue;

public class Separate_Number {
    public static void main(String[] args) {
        String str = "91001";
        boolean res=separateNumbers(str);
        System.out.println(res);
    }

    static boolean separateNumbers(String s) {
        int n = s.length();

        for (int i = 1; i < n; i++) {
            String firstPart = s.substring(0, i);

            // Check if the first part has a leading zero
            if (firstPart.length() > 1 && firstPart.charAt(0) == '0') {
                continue; // Move to the next iteration if there's a leading zero
            }

            long currentNum = Long.parseLong(firstPart);
            long nextExpectedNum = currentNum + 1;
            int j = i;

            while (j < n) {
                String nextPart = String.valueOf(nextExpectedNum);

                // Check if the remaining string starts with the expected number
                if (j + nextPart.length() <= n && s.startsWith(nextPart, j)) {
                    j += nextPart.length();
                    nextExpectedNum++;
                } else {
                    break; // If the condition is not met, break the loop
                }
            }

            // If we reached the end of the string, the current split is beautiful
            if (j == n) {
                return true;
            }
        }

        return false;

    }
}
