package com.ioprogrameexercicio01.model;

import com.ioprogrameexercicio01.enums.Sexo;

/**
 *
 * @author leandro
 */
public class Cliente {
    private Pessoa pessoa;
    private Contato contato;
    private Endereco endereco;
    private Sexo sexo;
    
    public Cliente() {}

    public Cliente(Pessoa pessoa, Contato contato, Endereco endereco, Sexo sexo) {
        this.pessoa = pessoa;
        this.contato = contato;
        this.endereco = endereco;
        this.sexo = sexo;
    }
    
    public void informacoesCliente() {
        this.pessoa.getNome();
        this.pessoa.getCpf();
        this.pessoa.getRg();
        this.pessoa.getanoDeNascimento();
        this.pessoa.getAnoAtual();
        this.pessoa.getGrupoSanguineo();
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "pessoa=" + pessoa + ", contato=" + contato + ", endereco=" + endereco + ", sexo=" + sexo + '}';
    }
    
}
