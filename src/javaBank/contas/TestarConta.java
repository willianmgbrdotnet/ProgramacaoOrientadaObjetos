package javaBank.contas;

public class TestarConta {
    public static void main(String[] args) {
        Conta contaJoao = new Conta();
        contaJoao.setSaldo(500);
        contaJoao.setSaldo(-100);
        contaJoao.sacar(200);
        contaJoao.depositar(1000);
        contaJoao.sacar(-500);
        contaJoao.depositar(-500);

        System.out.println(contaJoao.getSaldo());

        contaJoao.mostrarExtrato();

        //Os metodos estão aceitando valores negativos.
        //Redundância nos métodos que lêem o saldo. (Resolvido)
        //O objetoConta é construído sem a obrigatoriedade das informações básicas.

    }

}
