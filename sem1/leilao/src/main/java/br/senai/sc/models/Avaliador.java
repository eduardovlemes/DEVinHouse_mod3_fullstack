package br.senai.sc.models;

import java.util.List;

public class Avaliador {

    private double maiorLance = Double.NEGATIVE_INFINITY;
    private double menorLance = Double.POSITIVE_INFINITY;


    public void avalia(Leilao leilao){
        List<Lance> lancesDoLeilao = leilao.getListaLances();
        if (lancesDoLeilao.isEmpty()){
            throw new IllegalArgumentException("Lista de lances vazia");
        }
        for (Lance lance : lancesDoLeilao){
           if (lance.getValor() > maiorLance){
               maiorLance = lance.getValor();
           }
           if (lance.getValor() < menorLance){
                menorLance = lance.getValor();
            }
        }

    }

    public double getMaiorLance() {
        return maiorLance;
    }

    public double getMenorLance() {
        return menorLance;
    }
}
