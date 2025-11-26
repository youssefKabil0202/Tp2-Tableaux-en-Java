package ex2;

public class Exercice2 {
    public static void main(String[] args) {

        int[] t = {2, 4, 3, 5, 6};

        for (int i = 0; i < t.length; i++) {
            boolean isPivot = true;
            for (int l = 0; l < i; l++) {
                if (t[l] > t[i]) {
                    isPivot = false;
                    break;
                }
            }
            if (isPivot) {
                for (int r = i + 1; r < t.length; r++) {
                    if (t[r] < t[i]) {
                        isPivot = false;
                        break;
                    }
                }
            }

            if (isPivot) {
                System.out.println("t[" + i + "] = " + t[i]);
            }
        }
    }
}
