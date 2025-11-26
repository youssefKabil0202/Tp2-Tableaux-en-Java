//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
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



    }
}