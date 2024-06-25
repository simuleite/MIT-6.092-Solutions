class Newline {
    public static void newLine() {
        System.out.println("");
    }
    
    public static void threeLines() {
        newLine();
        newLine();
        newLine();
    }
    
    public static void main(String[] args) {
        System.out.println("Line 1");
        threeLines();
        System.out.println("Line 2");
    }
}