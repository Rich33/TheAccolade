/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game1;

/**
 *
 * @author Rich
 */
public class Chest extends Item {
    
    private int armour;
    
    public Chest(String name, String description, String manufacturer, int requiredLevel, int requiredStrength, int requiredDexterity, int requiredIntelligence) {
        super(name,description,manufacturer,requiredLevel,requiredStrength,requiredDexterity,requiredIntelligence);
        this.armour = armour;
        this.setSlot("Chest");
    }
    
    public int getArmour() {
        return armour;
    }
}
