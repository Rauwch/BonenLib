/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo2;
import javax.ejb.Remote;
import entities.ItemDO;
/**
 *
 * @author Anton
 */
@Remote
public interface ShoppingCartRemote {

    void addItem(ItemDO itemdo);
    
}
