class AccessArrays {
    public static void main(String[] args) {
        int[] values = { 12, 24, -23, 47 };
        values[3] = 18;
        int x = values[1] + 3;
        System.out.println(values[3] + " " + x);
    }
}