package ex10;

public class Exercice10 {
    public static boolean estCarreMagique(int[][] m) {

        if (m == null || m.length != 3) {
            return false;
        }

        for (int i = 0; i < 3; i++) {
            if (m[i] == null || m[i].length != 3) {
                return false;
            }
        }

        int sommeReference = m[0][0] + m[0][1] + m[0][2];

        for (int i = 1; i < 3; i++) {
            int sommeLigne = m[i][0] + m[i][1] + m[i][2];
            if (sommeLigne != sommeReference) {
                return false;
            }
        }

        for (int j = 0; j < 3; j++) {
            int sommeColonne = m[0][j] + m[1][j] + m[2][j];
            if (sommeColonne != sommeReference) {
                return false;
            }
        }

        int diagonalePrincipale = m[0][0] + m[1][1] + m[2][2];
        if (diagonalePrincipale != sommeReference) {
            return false;
        }

        int diagonaleSecondaire = m[0][2] + m[1][1] + m[2][0];
        if (diagonaleSecondaire != sommeReference) {
            return false;
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println("=== TEST 1  ===");
        int[][] carreMagique1 = {
                {2, 7, 6},
                {9, 5, 1},
                {4, 3, 8}
        };
        boolean resultat1 = estCarreMagique(carreMagique1);
        System.out.println("Résultat : " + (resultat1 ? "CARRÉ MAGIQUE :)" : "Pas un carré magique :("));
    }
}
