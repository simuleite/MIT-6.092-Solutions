public class GrandWizard extends Wizard {
    private String name;

    public GrandWizard(String wizardName) {
        name = wizardName;
    }
    
    public void sayName() {
        System.out.println("Grand wizard " + name);
    }
    
    public static void main(String[] args) {
        GrandWizard grandWizard1;
        grandWizard1 = new GrandWizard("Flash");
        grandWizard1.name = "Flash";
        grandWizard1.sayName();
        ((Dude)grandWizard1).sayName();
    }
}