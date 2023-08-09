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
        if ( saldo > 0) {
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

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    //Método Construtor
    public Conta(int numeroConta, int agencia, String titular){
        if (numeroConta > 0 && agencia > 0) {
            this.numeroConta = numeroConta;
            this.agencia = agencia;
            this.titular = titular;
        } else {
            System.out.println("O número da Conta e Agência precisam se positivos. A nova Conta NÃO foi criada.");
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
                return true;
            } else {
                System.out.println("Você NÃO tem dinheiro suficiente para transferir este Valor. Transferência Negada.");
                return false;
            }
        } else {
            System.out.println("Favor, digite um valor maior que 0 (zero). Transferência NÃO realizada!");
            return false;
        }
    }

    public void mostrarExtrato(){
        System.out.println("___________________________________");
        System.out.println("JavaBank -> O seu Banco");
        System.out.println("___________________________________");
        System.out.println("Conta número \t" + numeroConta);
        System.out.println("Agência \t\t" + agencia);
        System.out.println("Titular \t\t" + titular);
        System.out.println("Saldo \t\t\t" + saldo);
        System.out.println("___________________________________");
    }
}
