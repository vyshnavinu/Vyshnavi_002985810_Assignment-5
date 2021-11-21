/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.awt.Image;

/**
 *
 * @author srivyshnavi
 */
public class Menu {
    private String name;
    private String price;
    private Image picture;
    private String description;

    public Menu(String name, String price, Image picture, String description) {
        this.name = name;
        this.price = price;
        this.picture = picture;
        this.description = description;
    }

    Menu(String name, String desc, String amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return name;
    }
}
