class Marathon {
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
            System.out.println(names[i] + ":\t" + times[i]);
            if (times[i] < times[minIndex]) {
                secondMinIndex = minIndex; // 获取上个minIndex，即第二快的跑者
                minIndex = i;
            }
        }
        System.out.println("\nThe fastest runner: " + names[minIndex]);
        System.out.println("The second fastest runner: " + names[secondMinIndex]);
    }
    
}