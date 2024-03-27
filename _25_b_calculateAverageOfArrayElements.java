class _25_b_calculateAverageOfArrayElements {
    public static void main(String[] args) {
        int numbers[] = { 55, 40, 80, 65, 71 };
        double sum = 0, average = 0, len = numbers.length;
        for (int i = 0; i < len; i++)
            sum += numbers[i];
        average = sum / len;
        System.out.println("Average = " + average);
    }
}