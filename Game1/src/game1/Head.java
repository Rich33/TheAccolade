/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game1;

/**
 *
 * @author Rich
 */
public class Head extends Item {
       
    private int armour;
    
    public Head(String name, String description, String manufacturer, int requiredLevel, int requiredStrength, int requiredDexterity, int requiredIntelligence, int armour) {
        super(name,description,manufacturer,requiredLevel,requiredStrength,requiredDexterity,requiredIntelligence);
        this.armour = armour;
        this.setSlot("Head");
    }
    
    public int getArmour() {
        return armour;
    }
}
