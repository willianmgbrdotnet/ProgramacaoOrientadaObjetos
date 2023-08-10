package javaBank.clientes;

import javaBank.contas.Conta;

public class TestarCliente {
    public static void main(String[] args) {

        Cliente clienteJose = new Cliente("José", 12345678912L, "Mecânico", new Conta(123456,123));

        System.out.println(clienteJose.getNome());

    }
}
