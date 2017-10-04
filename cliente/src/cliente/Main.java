/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import servidor.CalculadoraServerInterface;

/**
 *
 * @author dirceubelem
 */
public class Main {

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("127.0.0.1");
            CalculadoraServerInterface c = (CalculadoraServerInterface) registry.lookup("CalculadoraServerInterfaceImpl");
            System.out.println("O objeto servidor " + c + " foi encontrado com sucesso.\n");

            // Somar
            System.out.println("A soma de 2 + 5 é: " + c.somar(2, 5));
            System.out.println("A subtração de 2 - 5 é: " + c.subtrai(2, 5, 8));

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
