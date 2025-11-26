package ex7;

public class Exercice7 {
    public static int elementMajoritaire(int[] t) {

        if (t == null || t.length == 0) {
            return -1;
        }

        int candidat = t[0];
        int compteur = 1;

        for (int i = 1; i < t.length; i++) {
            if (compteur == 0) {
                candidat = t[i];
                compteur = 1;
            } else if (t[i] == candidat) {
                compteur++;
            } else {
                compteur--;
            }
        }

        int occurrences = 0;
        for (int valeur : t) {
            if (valeur == candidat) {
                occurrences++;
            }
        }

        if (occurrences > t.length / 2) {
            return candidat;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        int[] t1 = {3, 3, 4, 3, 5};
        System.out.println("t = [3, 3, 4, 3, 5] →"+elementMajoritaire(t1));
        int[] t2 = {2, 2, 1, 2, 3, 2, 2};
        System.out.println("t =[2, 2, 1, 2, 3, 2, 2] ->"+elementMajoritaire(t2));
        int[] t3 = {1, 2, 3, 4};
        System.out.println("t =[1, 2, 3, 4] ->"+elementMajoritaire(t3));
    }
}
