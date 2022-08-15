/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fit5042.tutex.calculator;

import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.Remote;

import fit5042.tutex.repository.entities.Property;

/**
 *
 * @author Messom
 * @author Elliot
 */
@Remote
public interface CompareProperty {

    void addProperty(Property property);

    int bestPerRoom();

    void removeProperty(Property property);

    CompareProperty create() throws CreateException, RemoteException;
    
}