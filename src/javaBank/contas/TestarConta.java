package javaBank.contas;

public class TestarConta {
    public static void main(String[] args) {
        Conta contaJoao = new Conta();
        contaJoao.setSaldo(-500);
        contaJoao.depositar(-300);
        contaJoao.depositar(1000);
        contaJoao.sacar(-400);
        contaJoao.setNumeroConta(-250);
        contaJoao.setAgencia(-500);
        contaJoao.setTitular("João J");


        System.out.println(contaJoao.getSaldo());

        contaJoao.mostrarExtrato();

        //Os setters e metodos estão aceitando valores negativos.(Resolvido)
        //Redundância nos métodos que lêem o saldo. (Resolvido)
        //O objetoConta é construído sem a obrigatoriedade das informações básicas.

    }

}
