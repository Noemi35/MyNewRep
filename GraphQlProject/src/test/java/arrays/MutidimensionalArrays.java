package arrays;

public class MutidimensionalArrays {
    public static void main(String[] args) {


        int a[][] = new int[2][3]; //2 rows; 2 columns
        a[0][0] = 2;
        a[0][1] = 4;
        a[0][2] = 5;


        a[1][0] = 3;
        a[1][1] = 4;
        a[1][2] = 7;

        System.out.println(a[0][1]); //4

        int b[][] = {{2, 4, 5}, {1, 2, 4}}; //same like the other exercise
        System.out.println(b[1][2]);

        for (int i = 0; i < a.length; i++) { // Outer loop for rows
            for (int j = 0; j < a[i].length; j++) { // Inner loop for columns
                System.out.print(a[i][j] + " "); //2 4 5 3 4 7
            }

        }
    }
}
