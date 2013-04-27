package game1;

import java.util.HashMap;

/**
 *Class to store the details of a character
 * 
 * @author rich
 */
public class Character {
    private String name;
    private String title;
    
    private int maxHealth = 100;
    private int maxShield = 0;
    
    private int currentHealth;
    private int currentShield;
    private int armour;
    
    private boolean hasShield = false;
    
    //Attributes
    private int strength;
    private int dexterity;
    private int intelligence;
    
    //Equipped Items
    private HashMap<String, Item> equippedItems = new HashMap<String, Item>(7);
        //Possible slots:
        //weapon,shield,head,chest,hands,legs,feet
    
    private boolean isPlayer;
    
    public Character(String name, String title, int strength, int agility, int intelligence) {
        this.name = name;
        this.title = title;
        this.strength = strength;
        this.dexterity = agility;
        this.intelligence = intelligence;
    }
    
    public int attack() {
        Weapon weapon = (Weapon)equippedItems.get("Weapon");
        int baseDamage = weapon.getBaseDamage();
        int damageDone = baseDamage * dexterity;
        return damageDone;
    }
    
    public void takeDamage(int damage) {
        int damageTaken = damage;
        if (hasShield) {
            currentShield -= damageTaken;
        }
        else if (currentShield < damageTaken) {
            damageTaken -= currentShield;
            currentShield = 0;
            currentHealth -= damageTaken;
        }
        else {
            currentHealth -= damageTaken;
        }
    }
    
    public void equipItem(String slot, Item item) {
        equippedItems.put(slot, item);
        if (equippedItems.get("Shield") != null) {
            hasShield = true;
        }
        else {
            hasShield = false;
        }
    }
    
    private Item getEquippedItem(String slot) {
        return equippedItems.get(slot);
    }
    
    public int totalArmour() {
        int totalArmour = 0;
        totalArmour += getEquippedItem("Head").getArmour();
        totalArmour += getEquippedItem("Chest").getArmour();
        totalArmour += getEquippedItem("Hands").getArmour();
        totalArmour += getEquippedItem("Legs").getArmour();
        totalArmour += getEquippedItem("Feet").getArmour();
        return totalArmour;
    }
    
    private void setPlayer(boolean isPlayer) {
        this.isPlayer = isPlayer;
    }
}