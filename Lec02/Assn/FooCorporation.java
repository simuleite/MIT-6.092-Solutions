class FooCorporation {
    public static void fooCorporation(double basePay, int hoursWorked) {
        double totalPay = 0;
        if (basePay < 8) {
            System.out.println("Error: base pay is less than $8.00!");
            return;
        }

        if (hoursWorked <= 60) {
            if (hoursWorked > 40) {
                totalPay = basePay * 40 + (1.5 * basePay * (hoursWorked - 40));
            }
            else {
                totalPay = basePay * hoursWorked;
            }
            System.out.println("Total pay for " + hoursWorked + " hours: " + 
            totalPay);
        }
        else {
            System.out.println("Error: hours worked exceeds 60!");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Employee 1:");
        fooCorporation(7.5, 35);
        System.out.println("Employee 2:");
        fooCorporation(8.2, 47);
        System.out.println("Employee 3:");
        fooCorporation(10, 73);
    }
}