package Practice;

public class Diagonalsum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = matrix.length;
        int primarySum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
            // Primary Diagonal: i aur j same hote hain
            primarySum += matrix[i][i];

            // Secondary Diagonal: j ki value (n - 1 - i) hoti hai
            secondarySum += matrix[i][n - 1 - i];
        }

        System.out.println("Primary Diagonal Sum: " + primarySum);
        System.out.println("Secondary Diagonal Sum: " + secondarySum);
    }
}
    