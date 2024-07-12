class AssertExample {
    public static int findMinimum(int[] times) {
        int minValue = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < times.length; i++) {
            if (times[i] < minValue) {
                minValue = times[i];
                minIndex = i;
            }
        }
        
        return times[minIndex];
    }
    
    public static void printDifferenceFromFastest(int[] marathonTimes) {
        int fastestTime = findMinimum(marathonTimes);

        for (int time: marathonTimes) {
            int difference = time - fastestTime;
            assert difference >= 0;
            System.out.println("Difference: " + difference);
        }
    }
    
    public static void main(String[] args) {
        int[] times = {
            341, 273, 278, 329, 445, 
            402, 388, 275, 243, 334, 
            412, 393, 299, 343, 317, 
            265
        };
        printDifferenceFromFastest(times);
    }
}