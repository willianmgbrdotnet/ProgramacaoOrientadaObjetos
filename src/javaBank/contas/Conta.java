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

}
