/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo2;
import javax.ejb.Remote;

/**
 *
 * @author Anton
 */
@Remote
public interface StockManagerRemote {

    void addItem(String name, double price, String description);

    void sales();
    
}
