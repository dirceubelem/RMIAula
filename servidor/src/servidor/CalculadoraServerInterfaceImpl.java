/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author dirceubelem
 */
public class CalculadoraServerInterfaceImpl extends UnicastRemoteObject
        implements CalculadoraServerInterface {

    public CalculadoraServerInterfaceImpl() throws RemoteException {
        // construtor padrão
    }

    @Override
    public int somar(int a, int b) throws RemoteException {
        return a + b;
    }

    @Override
    public int subtrai(int a, int b, int c) throws RemoteException {
        return a - b - c;
    }

}
