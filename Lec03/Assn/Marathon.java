class Marathon {
    public static int getMinIndex(int[] times) {
        int minValue = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < times.length; i++) {
            if (times[i] < minValue) {
                minValue = times[i];
                minIndex = i;
            }
        }
        
        return minIndex;
    }
    
    public static int getSecondMinIndex(int[] times) {
        int secondMinIndex = -1;
        int minIndex = getMinIndex(times);

        for (int i = 0; i < times.length; i++) {
            if (i == minIndex) {
                continue;
            }
            if (secondMinIndex == -1 || times[i] < times[secondMinIndex]) {
                secondMinIndex = i;
            }
        }
        
        return secondMinIndex;
    }

    public static void printResult(int[] values) {
        int minIndex = -1, secondMinIndex = -1;
        minIndex = getMinIndex(values);
        secondMinIndex = getSecondMinIndex(values);
        System.out.println("The minIndex: " + minIndex + 
        " Value: " + values[minIndex]);
        if (secondMinIndex >= 0) {
            System.out.println("The secondMinIndex: " + secondMinIndex + 
            " Value: " + values[secondMinIndex] + "\n");
        }
        else {
            System.out.println("The secondMinIndex: " + secondMinIndex + "\n");
        }
       
    }

    public static void main(String[] args) {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", 
            "Matt",  "Alex",   "Emma",     "John",  "James", 
            "Jane",  "Emily",  "Daniel",   "Neda",  "Aaron", 
            "Kate"
        };
        
        int[] times = {
            341, 273, 278, 329, 445, 
            402, 388, 275, 243, 334, 
            412, 393, 299, 343, 317, 
            265
        };

        int minIndex = 0, secondMinIndex = 0;
        for (int i = 0; i < names.length; i++) {
            System.out.println(i + " " + names[i] + ":\t" + times[i]);
            if (times[i] < times[minIndex]) {
                // 原来下面的代码没有用 T=T
                // secondMinIndex = minIndex; // 获取上个minIndex，即第二快的跑者
                minIndex = i;
            } // 扫描到最大值后，上面的代码会停止比较
            else if (times[i] < times[secondMinIndex] && i != minIndex) {
                secondMinIndex = i;
            }
        }
        System.out.println("\nThe fastest runner: " + names[minIndex]);
        System.out.println("The second fastest runner: " + names[secondMinIndex] 
        + "\n");
        
        System.out.println("Lec04 Method: ");
        printResult(times);
        int[] values1 = {0};
        int[] values2 = {0, 0};
        int[] values3 = {0, 1};
        System.out.println("values = {0}: ");
        printResult(values1);
        System.out.println("values = {0, 0}: "); // The minIdx is 1!
        printResult(values2);
        System.out.println("values = {0, 1}: ");
        printResult(values3);
    }
}