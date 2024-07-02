public class LoopsAndArrays {
    public static void example1() {
        int[] values = new int[5];

        for (int i = 0; i < values.length; i++) {
            values[i] = i;
            int y = values[i] * values[i];
            System.out.println(y);
        }
    }
    
    public static void example2() {
        int[] values = new int[5];
        int i = 0;
        while (i < values.length) {
            values[i] = i;
            int y = values[i] * values[i];
            System.out.println(y);;
            i++;
        }
    }

    public static void main(String[] args) {
        example1();
        System.out.println();
        example2();
    }
}