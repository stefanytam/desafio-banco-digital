/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafiobancodigital;

import java.util.Scanner;

/**
 *
 * @author stefa
 */
public class DesafioBancoDigital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Stefany");
        
        Conta poupanca = new ContaPoupança(cliente);
        Conta cc = new ContaCorrente(cliente);     
        
        cc.depositar(100);
        cc.transferir(100, poupanca);
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        
    }

}
