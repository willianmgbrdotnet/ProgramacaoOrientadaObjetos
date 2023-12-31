package javaBank.contas;

import javaBank.clientes.Cliente;

public class Conta {
    //Esses são dados sensíveis da Classe e que não estarão visíveis para serem acessados fora da Classe.
    private double saldo;
    private int agencia;
    private int numeroConta;
     private Cliente titular;

    //Os getters e setter permitirão acessar os atributos privados da Classe
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if ( saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Favor, digite um valor maior que 0 (zero). Valor de Saldo inválido!");
        }

    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if ( agencia > 0) {
            this.agencia = agencia;
        } else {
            System.out.println("Favor, digite um valor maior que 0 (zero). Número de Agência inválido!");
        }

    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        if ( numeroConta > 0) {
            this.numeroConta = numeroConta;
        } else {
            System.out.println("Favor, digite um valor maior que 0 (zero). Número de conta inválido!");
        }

    }

//    public Cliente getTitular() {
//        return titular;
//    }
//    public void setTitular(Cliente titular) {
//        this.titular = titular;
//    }

    //Método Construtor
    public Conta(int numeroConta, int agencia, double saldo){
        if (numeroConta > 0 && agencia > 0 && saldo >= 0) {
            this.numeroConta = numeroConta;
            this.agencia = agencia;
            this.saldo = saldo;

        } else {
            System.out.println("O número da Conta e Agência precisam ser positivos. A nova Conta NÃO foi criada.");
            System.out.println("O saldo não pode ser negativo");
        }
    }

    //métodos da Classe - Funções da Conta
    public void depositar(double valor){
        if ( valor > 0) {
            //this.saldo = saldo + valor;
            this.saldo += valor;
        } else {
            System.out.println("Favor, digite um valor maior que 0 (zero). Depósito NÃO realizado!");
        }

    }

    public  boolean sacar(double valor){
        if ( valor > 0) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
                return true;
            } else {
                System.out.println("Você NÃO tem dinheiro suficiente para sacar este Valor. Saque Negado.");
                return false;
            }
        } else {
            System.out.println("Favor, digite um valor maior que 0 (zero). Saque NÃO realizado!");
            return false;
        }

    }

    public boolean transferir(double valor, Conta destino){
        if ( valor > 0) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
                destino.depositar(valor);
                System.out.println("Tranferência realizada com SUCESSO");
                System.out.println("Seu saldo depois da Transferência é: " + this.getSaldo());
                return true;
            } else {
                System.out.println("Você NÃO tem dinheiro suficiente. Transferência Negada.");
                return false;
            }
        } else {
            System.out.println("Favor, digite um valor maior que 0 (zero). Transferência NÃO realizada!");
            return false;
        }
    }




}
