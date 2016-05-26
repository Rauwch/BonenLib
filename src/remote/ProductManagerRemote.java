/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remote;

import javax.ejb.Remote;

/**
 *
 * @author Anton
 */
@Remote
public interface ProductManagerRemote {

    void createCoffee(String name, String description, double pricePerKilo, int type, String country, int strength, boolean isCaffeinated);

    void createTea(String name, String description, double pricePerKilo, String country, String teaType);
    
}
