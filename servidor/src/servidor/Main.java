/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author dirceubelem
 */
public class Main {

    public static void main(String[] args) {
        try {
            
            CalculadoraServerInterface csi = new CalculadoraServerInterfaceImpl();
            Registry registry = LocateRegistry.getRegistry();
            registry.rebind("CalculadoraServerInterfaceImpl", csi);
            
            System.out.println("Servidor Calculadora " + csi
                    + " registrado e pronto para aceitar solicitações.");
            
        } catch (Exception ex) {
            System.out.println("Houve um erro: " + ex.getMessage());
        }
    }
}
