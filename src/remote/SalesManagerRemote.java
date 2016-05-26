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
public interface SalesManagerRemote {

    void createReseller(String name, String email, String street,String city, int nr, String country, int cellphone);

    void createFarmer(String name, String email, String street,String city, int nr, String country );
    
}
