public class Baby { // declare a Baby
    /* Fields */
    String name = "Slim Shady"; // Reference: array/object
    // static String name = "DMX";
    boolean isMale; // Primitive: basic java type
    double weight = 5.0;
    double decibels;
    int numPoops = 0;
    Baby[] siblings; // sisters and brothers
    // Primitive: fixed size cup; var stores value
    // Object: stored somewhere else, can't fit in a var; var stores addr
    // Reference: the object's location
    static int numBabiesMade = 0;
    // int numBabiesMade = 0;
    
    /* Constructor */
    Baby (String myname, boolean maleBaby) {
        name = myname;
        isMale = maleBaby;
        numBabiesMade += 1;
    }
 
    /* Methods */
    void poop() {
        numPoops += 1;
        System.out.println("Dear mother, I have pooped. Ready the diaper.");
    }
    
    void sayHi() {
        System.out.println("Hi, my name is.. " + name);
    }
    
    void eat(double foodWeight) {
        if (foodWeight >= 0 && foodWeight < weight) {
            weight = weight + foodWeight;
        }
    }
    
    void doSomething(int x, int[] ys, Baby b) {
        x = 99;
        ys[0] = 99;
        b.name = "99";
    }
    
    // static void cry(Baby thebaby) {
        // System.out.println(thebaby.name + " cries");
    // }
    
    void cry() {
        System.out.println(name + " cries");
    }
    
    // static void whoami() {
    // When it is static, it cannot use non-static field "name".
    // Because static fields and methods are shared with all instances.
    // Static fileds are for values which specific to the class and not a specific instance.
    // Constant can be a static field. something where you have a limited set which doesn't change ofen.

    // e.g. color of a car is non-static, it is a specific attribute.
    // That's why static method cannote reference non-static method.

    // error: non-static variable count cannot be referenced from a static context.
        // System.out.println(name);
    // }
    
    /* Having a main method means the class can be run */
    public static void main(String[] args) { 
        // class Instances
        Baby shiloh = new Baby("Shiloh Jolie-Pitt", true); // Instance
        Baby knox = new Baby("Knox Jolie-Pitt", false);
        Baby shiloh2 = new Baby("Shiloh Jolie-Pitt", true); // Instance
       
        System.out.println(shiloh.name);
        System.out.println(shiloh.numPoops);
        shiloh.sayHi();
        shiloh.eat(1);

        System.out.println("new Baby shiloh and shiloh2, " + 
        "Does shiloh == shiloh2? " + (shiloh == shiloh2));
        // shiloh1 and shiloh2 store in different location. They're two references.

        Baby mybaby = new Baby("davy", true);
        mybaby.sayHi();
        mybaby.name = "david";
        mybaby.sayHi();

        Baby shiloh1 = shiloh2; // no new. Not considered in numBabiesMade.
        // Using '=' updates the reference. Former object shiloh1 is still exist.
        System.out.println("shiloh1 = shiloh2, " + 
        "Does shiloh1 == shiloh2? " + (shiloh1 == shiloh2));

        int i = 0;
        int[] j = {0};
        Baby k = new Baby("50", true);
        System.out.println("i: " + i + " j: " + j + " k: " + k);
        k.doSomething(i, j, k);
        System.out.println("i: " + i + " j: " + j + " k: " + k);

        // Baby.numBabiesMade = 100;
        Baby b1 = new Baby("b1", true);
        Baby b2 = new Baby("b2", true);
        System.out.println(b1.numBabiesMade + " " + b2.numBabiesMade);
        // Baby.numBabiesMade = 2;
        System.out.println(b1.numBabiesMade + " " + b2.numBabiesMade);
        
        // mybaby.cry(mybaby);
        mybaby.cry();
        // mybaby.whoami();
    }
}