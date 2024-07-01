class Scope {
    public static void main(String[] args) {
        int x = 5;
        if (x == 5) {
            int x = 6;
            int y = 72;
            System.out.println("x = " + x + "y = " + y);
        }
        System.out.println("x = " + x + "y = " + y);
    }
} 