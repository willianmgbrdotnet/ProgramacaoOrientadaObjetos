package javaBank.banco;

import javaBank.clientes.Cliente;
import javaBank.contas.Conta;

public class Banco {
    public static void main(String[] args) {

        Cliente clienteJava = new Cliente("Cliente Java", 12345678912L, "Linguagem de Programação",
                new Conta(1234567, 123, 1000));
        clienteJava.mostrarExtrato();

        Cliente clienteRecebedor = new Cliente("Cliente Recebedor", 98765432198L, "Alvo Transfer",
                new Conta(9876543, 123, 0));
        clienteRecebedor.mostrarExtrato();

        clienteJava.getConta().transferir(500, clienteRecebedor.getConta());

        clienteJava.mostrarExtrato();

    }
}
