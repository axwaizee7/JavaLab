class Swaptwonumbers {
    public static void main(String args[]) {
        int x=10, y=20, z;
        System.out.printf("\nBefore swap\nx = %d\ny = %d", x, y);
        z=x;
        x=y;
        y=z;
        System.out.printf("\nAfter swap\nx = %d\ny = %d", x, y);

        // This is for without using extra variable
        // x=x+y;
        // y=x-y;
        // x=x-y;
        
    }
}