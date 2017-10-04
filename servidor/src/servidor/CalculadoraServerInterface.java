/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author dirceubelem
 */
public interface CalculadoraServerInterface extends Remote {

    public int somar(int a, int b) throws RemoteException;
    public int subtrai(int a, int b, int c) throws RemoteException;

}
