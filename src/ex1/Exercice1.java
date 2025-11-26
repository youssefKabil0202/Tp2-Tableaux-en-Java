package ex1;

public class Exercice1 {
    public static int longueurLIS(int[] t) {
        int n = t.length;
        if (n == 0) {
            return 0;
        }
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (t[j] < t[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] > maxLength) {
                maxLength = dp[i];
            }
        }

        return maxLength;
    }
    public static void main(String[] args) {
        int[] t = {2, 1, 4, 2, 3, 5, 1, 7};
        System.out.println("Longueur LIS : "+ longueurLIS(t));

        int[] test1 = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println("Longueur LIS : "+longueurLIS(test1));

        int[] test2 = {0, 1, 0, 3, 2, 3};
        System.out.println("Longueur LIS : "+longueurLIS(test2));

        int[] test3 = {7, 7, 7, 7, 7};
        System.out.println("Longueur LIS : "+longueurLIS(test3));

        int[] test4 = {};
        System.out.println("Longueur LIS : "+longueurLIS(test4));
    }
}
