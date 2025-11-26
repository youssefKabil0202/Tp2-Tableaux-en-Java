package ex3;

public class Exercice3 {
    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = new int[n][n];

        int Number = 1;
        int row = 0, col = 0;
        String direction = "right";

        while (Number <= n * n) {
            matrix[row][col] = Number;
            Number++;

            switch (direction) {
                case "right":
                    if (col + 1 < n && matrix[row][col + 1] == 0) {
                        col++;
                    } else {
                        direction = "down";
                        row++;
                    }
                    break;

                case "down":
                    if (row + 1 < n && matrix[row + 1][col] == 0) {
                        row++;
                    } else {
                        direction = "left";
                        col--;
                    }
                    break;

                case "left":
                    if (col - 1 >= 0 && matrix[row][col - 1] == 0) {
                        col--;
                    } else {
                        direction = "up";
                        row--;
                    }
                    break;

                case "up":
                    if (row - 1 >= 0 && matrix[row - 1][col] == 0) {
                        row--;
                    } else {
                        direction = "right";
                        col++;
                    }
                    break;
            }
        }

        System.out.println("Matrice en spirale:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j]<10)
                System.out.print(matrix[i][j] + "  ");
                else
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
