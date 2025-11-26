package ex6;

public class Exercice6 {
    public static int elementMajoritaire(int[] tableau) {
        if (tableau.length == 0) return -1;


        int candidat = tableau[0];
        int count = 1;

        for (int i = 1; i < tableau.length; i++) {
            if (count == 0) {
                candidat = tableau[i];
                count = 1;
            } else if (tableau[i] == candidat) {
                count++;
            } else {
                count--;
            }
        }


        int occurrences = 0;
        for (int nombre : tableau) {
            if (nombre == candidat) {
                occurrences++;
            }
        }

        return (occurrences > tableau.length / 2) ? candidat : -1;
    }
    public static void main(String[] args) {
        int[][] tests = {
                {3, 2, 3},
                {2, 2, 1, 1, 1, 2, 2},
                {1, 2, 3},
                {1},
                {1, 1, 2, 2}
        };

        for (int[] test : tests) {
            System.out.println(java.util.Arrays.toString(test) + " → " +
                    elementMajoritaire(test));
        }

    }
}
