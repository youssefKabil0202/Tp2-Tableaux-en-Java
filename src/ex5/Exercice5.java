package ex5;

public class Exercice5 {
    static boolean IsPerCirculaire(int[] t) {
        int n = t.length;
        int pos1 = -1;

        for (int i = 0; i < n; i++) {
            if (t[i] == 1) pos1 = i;
        }
        if (pos1 == -1) return false;

        for (int i = 0; i < n; i++) {
            if (t[(pos1 + i) % n] != i + 1) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6,7,1, 2};
        System.out.println("Is it a permutation circulaire ? :"+IsPerCirculaire(arr));
    }


}
