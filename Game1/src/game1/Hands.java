package game1;

public class Hands extends Item {
    
    private int armour;
    
    public Hands(String name, String description, String manufacturer, int requiredLevel, int requiredStrength, int requiredDexterity, int requiredIntelligence) {
        super(name,description,manufacturer,requiredLevel,requiredStrength,requiredDexterity,requiredIntelligence);
        this.armour = armour;
        this.setSlot("Hands");
    }
    
    public int getArmour() {
        return armour;
    }
}
