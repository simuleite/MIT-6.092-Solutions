package parenttools;

public class Baby {
    int servings;
    
    void feed(int servings) {
        this.servings = this.servings + servings;
    }
    
    void poop() {
        System.out.println("All better!");
        servings = 0;
    }
}