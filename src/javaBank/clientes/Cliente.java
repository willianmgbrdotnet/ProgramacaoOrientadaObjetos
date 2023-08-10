package javaBank.clientes;

import javaBank.contas.Conta;


public class Cliente {
    private String nome;
    private long cpf;
    private String profissao;
    private Conta conta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        if (cpf > 0) {
            this.cpf = cpf;
        } else {
            System.out.println("Favor digitar um valor maior que 0 (zero). Número de CPF inválido");
        }
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    //Construtor
    public Cliente(String nome, long cpf, String profissao, Conta conta){
        if (cpf > 0) {
            this.nome = nome;
            this.cpf = cpf;
            this.profissao= profissao;
            this.conta = conta;
        } else {
            System.out.println("Favor digitar um valor maior que 0 para o CPF. O novo Cliente não foi criado.");
        }


    }
}
