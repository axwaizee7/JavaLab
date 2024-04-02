class _26_a_2DMultiplicationTable {
    public static void main(String[] args) {
        int row = 10, column = 10;
        int product[][] = new int[row][column];
        System.out.println("MULTIPLICATION TABLE");
        System.out.println(" ");
        int i, j;
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= column; j++) {
                product[i - 1][j - 1] = i * j;
                System.out.printf("%4d", (product[i - 1][j - 1]));
            }
            System.out.println(" ");
        }
    }
}