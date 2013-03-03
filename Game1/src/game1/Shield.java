/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game1;

/**
 *
 * @author Rich
 */
public class Shield extends Item {
    private int maxShield;
    
    public Shield(String name, String description, String manufacturer, int requiredLevel, int requiredStrength, int requiredDexterity, int requiredIntelligence, int maxShield) {
        super(name,description,manufacturer,requiredLevel,requiredStrength,requiredDexterity,requiredIntelligence);
        this.maxShield = maxShield;
        this.setSlot("Shield");
    }
    
    public int getMaxShield() {
        return maxShield;
    }
}