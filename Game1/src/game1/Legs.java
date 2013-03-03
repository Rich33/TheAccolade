/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game1;

/**
 *
 * @author Rich
 */
public class Legs extends Item{
    
    private int armour;
    
    public Legs(String name, String description, String manufacturer, int requiredLevel, int requiredStrength, int requiredDexterity, int requiredIntelligence, int armor) {
        super(name,description,manufacturer,requiredLevel,requiredStrength,requiredDexterity,requiredIntelligence);
        this.armour = armour;
        this.setSlot("Legs");
    }
    
    public int getArmour() {
        return armour;
    }
}
