package game1;

/**
 * Superclass for all Item objects
 * @author rich
 */
public class Item {
    //Details
    private String name;
    private String description;
    private String manufacturer;
    
    //Stats
    private int condition = 100;
    private String slot;
    
    //Requirements
    private int requiredLevel;
    private int requiredStrength;
    private int requiredDexterity;
    private int requiredIntelligence;
    
    public Item (String name, String description, String manufacturer, int requiredLevel, int requiredStrength, int requiredAgility, int requiredIntelligence) {
        this.name = name;
        this.description = description;
        this.manufacturer = manufacturer;
        
        this.requiredLevel = requiredLevel;
        this.requiredStrength = requiredStrength;
        this.requiredDexterity = requiredAgility;
        this.requiredIntelligence = requiredIntelligence;
    }
    
    public boolean canUse(int level, int strength, int agility, int intelligence) {
        if (level >= requiredLevel && strength >= requiredStrength && agility >= requiredDexterity && intelligence >= requiredIntelligence) {
            return true;
        }
        return false;
    }
    
    public void increaseCondition(int amount) {
        condition += amount;
    }
    
    public void deacreaseCondition(int amount) {
        condition -= amount;
    }
    
    public void setSlot(String slot) {
        this.slot = slot;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDesctiption() {
        return description;
    }
    
    public String getManufacturer() {
        return manufacturer;
    }
    
    public int getCondition() {
        return condition;
    }
    
    public String getSlot() {
        return slot;
    }
    
    public int getRequiredLevel() {
        return requiredLevel;
    }
    
    public int getRequiredStrength() {
        return requiredStrength;
    }
    
    public int getRequiredDexterity() {
        return requiredDexterity;
    }
    
    public int getRequiredIntelligence() {
        return requiredIntelligence;
    }
    
    public int getArmour() {
        return 0;
    }
}

