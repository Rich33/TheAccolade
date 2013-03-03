package game1;

public class Weapon extends Item {
    
    private int baseDamage;
    private int accuracy;
    
    public Weapon(String name, String description, String manufacturer, int requiredLevel, int requiredStrength, int requiredDexterity, int requiredIntelligence, int baseDamage, int accuracy) {
        super(name,description,manufacturer,requiredLevel,requiredStrength,requiredDexterity,requiredIntelligence);
        this.baseDamage = baseDamage;
        this.accuracy = accuracy;
        this.setSlot("Weapon");
    }
    
    public int getBaseDamage() {
        return baseDamage;
    }
    
    public int getAccuracy() {
        return accuracy;
    }
}
