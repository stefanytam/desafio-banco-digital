/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafiobancodigital;

/**
 *
 * @author stefa
 */
public class ContaPoupança extends Conta {

    public ContaPoupança(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Poupança ***");
        super.imprimirInfosComuns();
    }
}
