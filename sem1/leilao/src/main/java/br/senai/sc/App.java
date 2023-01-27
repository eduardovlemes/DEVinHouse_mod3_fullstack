package br.senai.sc;

import br.senai.sc.models.Avaliador;
import br.senai.sc.models.Lance;
import br.senai.sc.models.Leilao;
import br.senai.sc.models.Usuario;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        Usuario brayam = new Usuario("Brayam",25,"111.222.333-45");
        Lance l1 = new Lance(200,brayam);
        Lance l2 = new Lance(300,brayam);
        Lance l3 = new Lance(400,brayam);
        Leilao leilao =  new Leilao(new Date(2023,01,18),new Date(2023,01,20));
        leilao.adiciona(l1);
        leilao.adiciona(l2);
        leilao.adiciona(l3);
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);
        double maiorLanceEsperado = 400;
        double menorLanceEsperado = 200;
        System.out.println(maiorLanceEsperado == leiloeiro.getMaiorLance());
        System.out.println(menorLanceEsperado == leiloeiro.getMenorLance());
    }
}