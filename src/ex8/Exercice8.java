package ex8;

public class Exercice8 {
    public static void afficherElementsManquants(int[] t) {
        if (t == null || t.length == 0) {
            System.out.println("Tableau vide");
            return;
        }

        int n = t.length;
        boolean[] present = new boolean[n + 1];

        for (int valeur : t) {
            if (valeur >= 1 && valeur <= n) {
                present[valeur] = true;
            }
        }

        boolean IsMissing = true;
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                System.out.print(i + " ");
                IsMissing = false;
            }
        }

        if (IsMissing) {
            System.out.println("Aucun élément manquant");
        } else {
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] t1 = {1, 3, 3, 5};
        System.out.print("t = [1, 3, 3, 5] ,Éléments manquants : ");
        afficherElementsManquants(t1);

        int[] t2 = {1, 2, 3, 4};
        System.out.print("t = [1, 2, 3, 4] ,Éléments manquants : ");
        afficherElementsManquants(t2);

        int[] t3 = {1,1,1,1};
        System.out.print("t = [1, 1, 1, 1], Éléments manquants : ");
        afficherElementsManquants(t3);

    }
}
