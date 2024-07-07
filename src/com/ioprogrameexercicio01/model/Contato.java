package com.ioprogrameexercicio01.model;

/**
 *
 * @author leandro
 */
public class Contato {
    private int dd;
    private String numeroCelular;
    private String numeroFixo;
    private String email;
    private String whatsapp;
    private String instagram;
    private String linkedin;
    
    public Contato() {}

    public Contato(int dd, String numeroCelular, String numeroFixo, String email, String whatsapp, String instagram, String linkedin) {
        this.dd = dd;
        this.numeroCelular = numeroCelular;
        this.numeroFixo = numeroFixo;
        this.email = email;
        this.whatsapp = whatsapp;
        this.instagram = instagram;
        this.linkedin = linkedin;
    }

    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getNumeroFixo() {
        return numeroFixo;
    }

    public void setNumeroFixo(String numeroFixo) {
        this.numeroFixo = numeroFixo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    @Override
    public String toString() {
        return "Contato{" + "dd=" + dd + ", numeroCelular=" + numeroCelular + ", numeroFixo=" + numeroFixo + ", email=" + email + ", whatsapp=" + whatsapp + ", instagram=" + instagram + ", linkedin=" + linkedin + '}';
    }
    
}
