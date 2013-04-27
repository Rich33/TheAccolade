package game1;

public class Feet extends Item {
    
    private int armour;
    
    public Feet(String name, String description, String manufacturer, int requiredLevel, int requiredStrength, int requiredDexterity, int requiredIntelligence, int armour) {
        super(name,description,manufacturer,requiredLevel,requiredStrength,requiredDexterity,requiredIntelligence);
        this.armour = armour;
        this.setSlot("Feet");
    }
    
    public int getArmour() {
        return armour;
    }
}
