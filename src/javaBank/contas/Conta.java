package javaBank.contas;

public class Conta {
    //Esses são dados sensíveis da Classe e que não estarão visíveis para serem acessados fora da Classe.
    private double saldo;
    private int agencia;
    private int numeroConta;
    private String titular;

    //Os getters e setter permitirão acessar os atributos privados da Classe
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    //métodos da Classe - Funções da Conta
    public void depositar(double valor){
        //this.saldo = saldo + valor;
        this.saldo += valor;
    }

    public  boolean sacar(double valor){
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Você NÃO tem dinheiro suficiente para sacar este Valor. Saque Negado.");
            return false;
        }
    }

    public boolean transferir(double valor, Conta destino){
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.depositar(valor);
            return true;
        } else {
            System.out.println("Você NÃO tem dinheiro suficiente para transferir este Valor. Transferência Negada.");
            return false;
        }
    }

    public void mostrarExtrato(){
        System.out.println("JavaBank -> O seu Banco");
        System.out.println("Conta número \t" + this.numeroConta);
        System.out.println("Agência \t\t" + this.agencia);
        System.out.println("Titular \t\t" + this.titular);
        System.out.println("Saldo \t\t\t" + this.saldo);
    }
}
