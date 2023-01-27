package br.senai.sc.models;

public class Lance {

    private double valor;
    private Usuario usuario;

    public Lance(int valor, Usuario usuario) {
        super();
        this.valor = valor;
        this.usuario = usuario;
    }


    public double getValor() {
        return valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
