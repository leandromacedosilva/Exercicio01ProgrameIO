package com.ioprogrameexercicio01.model;

/**
 *
 * @author leandro
 */
public class Endereco {
    private String rua;
    private int numero;
    private String cep;
    private String bairro;
    private String cidade;
    private String uf;
    private String pais;
    
    public Endereco() {}

    public Endereco(String rua, int numero, String cep, String bairro, String cidade, String uf, String pais) {
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.pais = pais;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Endereco{" + "rua=" + rua + ", numero=" + numero + ", cep=" + cep + ", bairro=" + bairro + ", cidade=" + cidade + ", uf=" + uf + ", pais=" + pais + '}';
    }
    
}
