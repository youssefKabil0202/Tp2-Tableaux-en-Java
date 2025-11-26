package ex4;

public class Exercice4 {
    public static int sommeMaxNum(int[] T) {
        if (T.length == 0) return 0;

        int maxGlobal = T[0];
        int maxLocal = T[0];

        for (int i = 1; i < T.length; i++) {
            maxLocal = Math.max(T[i], maxLocal + T[i]);
            maxGlobal = Math.max(maxGlobal, maxLocal);
        }

        return maxGlobal;
    }

    public static void main(String[] args) {
        int[] T = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Somme maximale: " + sommeMaxNum(T));
    }
}
