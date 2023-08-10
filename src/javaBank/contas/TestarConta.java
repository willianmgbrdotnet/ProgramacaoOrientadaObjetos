package javaBank.contas;

import javaBank.clientes.Cliente;

public class TestarConta {
    public static void main(String[] args) {



        Conta contaJoao = new Conta(123456, 123);
        contaJoao.setSaldo(-500);
        contaJoao.depositar(-300);
        contaJoao.depositar(1000);
        contaJoao.sacar(-400);
        contaJoao.setNumeroConta(-250);
        contaJoao.setAgencia(-500);




        System.out.println(contaJoao.getSaldo());



        //Os setters e metodos estão aceitando valores negativos.(Resolvido)
        //Redundância nos métodos que lêem o saldo. (Resolvido)
        //O objetoConta é construído sem a obrigatoriedade das informações básicas (Resolvido).

    }

}
