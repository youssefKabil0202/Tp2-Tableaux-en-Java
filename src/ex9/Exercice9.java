package ex9;

public class Exercice9 {
    public static int differenceDiagonales(int[][] m) {

        if (m == null) {
            System.out.println("La matrice est null");
            return 0;
        }
        int n = m.length;

        for (int i = 0; i < n; i++) {
            if (m[i] == null || m[i].length != n) {
                System.out.println("La matrice n'est pas carrée");
                return 0;
            }
        }

        if (n == 0) {
            System.out.println("Matrice vide");
            return 0;
        }

        int sommePrincipale = 0;
        int sommeSecondaire = 0;

        for (int i = 0; i < n; i++) {
            sommePrincipale += m[i][i];
            sommeSecondaire += m[i][n - 1 - i];
        }

        int difference = Math.abs(sommePrincipale - sommeSecondaire);

        System.out.println("Somme diagonale principale : " + sommePrincipale);
        System.out.println("Somme diagonale secondaire : " + sommeSecondaire);
        System.out.println("Différence absolue : " + difference);

        return difference;
    }
    public static void main(String[] args) {
        System.out.println("=== TEST 1 ===");
        int[][] m1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        differenceDiagonales(m1);
        System.out.println("=== TEST 2 ===");
        int[][] m2 = {
                {1, 3, 5},
                {2, 4, 6},
                {7, 8, 9}
        };
        differenceDiagonales(m2);
    }
}
