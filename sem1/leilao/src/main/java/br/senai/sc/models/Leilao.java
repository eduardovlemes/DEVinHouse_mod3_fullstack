package br.senai.sc.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Leilao {

    private Date dataInicio;
    private Date dataTermino;
    private List<Lance> listaLances;

    public Leilao(Date dataInicio, Date dataTermino) {
        super();
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.listaLances = new ArrayList<>();
    }

    public void adiciona(Lance lance){
        this.listaLances.add(lance);
    }

    public void remove(Lance lance){
        this.remove(lance);
    }


    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    public List<Lance> getListaLances() {
        return listaLances;
    }

    public void setListaLances(List<Lance> listaLances) {
        this.listaLances = listaLances;
    }
}
