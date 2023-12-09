class NumberPattern {
    public static void main(String[] args) {
        int rows = 4;
        printPattern(rows);
    }

    static void printPattern(int rows) {
        int num = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num * num + "\t");
                num++;
            }
            System.out.println();
        }
    }
}
