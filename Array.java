public class Array {

    public static void main(String[] arg) {

        int num[] = new int[2];
        num[0] = 4;
        num[1] = 5;

        System.out.println(num[1]);  // prints 5

        // 2D array: 2 rows, 3 columns
        int array[][] = new int[2][3];

        // Fill array with random values
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }

        // Print the array
        for (int k = 0; k < array.length; k++) {
            for (int l = 0; l < array[k].length; l++) {
                System.out.print(array[k][l] + " ");
            }
            System.out.println();
        }
    }
}
