/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game1;

/**
 *
 * @author Rich
 */
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
