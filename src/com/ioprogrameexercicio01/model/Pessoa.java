package com.ioprogrameexercicio01.model;

import java.io.PrintStream;

/**
 *
 * @author leandro
 */
public class Pessoa {
    
    PrintStream so = System.out;
    
    private String nome;
    private String cpf;
    private String rg;
    private int anoDeNascimento;
    private int anoAtual;
    private String grupoSanguineo;
    
    public Pessoa() {}

    public Pessoa(String nome, String cpf, String rg, int anoDeNascimento, int anoAtual, String grupoSanguineo) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.anoDeNascimento = anoDeNascimento;
        this.anoAtual = anoAtual;
        this.grupoSanguineo = grupoSanguineo;
    }
    
    public void informacoesPessoa() {
        if((this.anoAtual - this.anoDeNascimento) > 17) {
            so.println(this.nome + " voce e maior de idade.");
            so.println("Nome: " + this.nome);
            so.println("CPF: " + this.cpf);
            so.println("RG: " + this.rg);
            so.println("Ano de nascimento: " + this.anoDeNascimento);
            so.println("Ano corrente: " + this.anoAtual);
            so.println("Grupo sanguineo: " + this.grupoSanguineo);
            so.println("Idade: " + (this.anoAtual - this.anoDeNascimento) + " anos + -.");
        } else {
            so.println(this.nome + " voce e menor de idade.");
            so.println("Nome: " + this.nome);
            so.println("CPF: " + this.cpf);
            so.println("RG: " + this.rg);
            so.println("Ano de nascimento: " + this.anoDeNascimento);
            so.println("Ano corrente: " + this.anoAtual);
            so.println("Grupo sanguineo: " + this.grupoSanguineo);
            so.println("Idade: " + (this.anoAtual - this.anoDeNascimento) + " anos + -.");
        }
    }
       
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getanoDeNascimento() {
        return anoDeNascimento;
    }

    public void setanoDeNascimento(int anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }

    public int getAnoAtual() {
        return anoAtual;
    }

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", anoDeNascimento=" + anoDeNascimento + ", anoAtual=" + anoAtual + ", grupoSanguineo=" + grupoSanguineo + '}';
    }
    
}
