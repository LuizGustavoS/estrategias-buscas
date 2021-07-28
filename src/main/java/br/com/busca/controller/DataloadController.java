package br.com.busca.controller;

import br.com.busca.model.Edge;
import br.com.busca.model.Node;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DataloadController {

    public static List<Node> carregarRotasTerrestres(){

        Node aracaju = new Node("Aracajú");
        Node belem = new Node("Belém");
        Node beloHorizonte = new Node("Belo Horizonte");
        Node boaVista = new Node("Boa Vista");
        Node brasilia = new Node("Brasília");
        Node campoGrande = new Node("Campo Grande");
        Node cuiaba = new Node("Cuiabá");
        Node curitiba = new Node("Curitiba");
        Node florianopolis = new Node("Florianópolis");
        Node fortaleza = new Node("Fortaleza");
        Node goiania = new Node("Goiânia");
        Node joaoPessoa = new Node("João");
        Node macapa = new Node("Macapá");
        Node maceio = new Node("Maceió");
        Node manaus = new Node("Manaus");
        Node natal = new Node("Natal");
        Node palmas = new Node("Palmas");
        Node portoAlegre = new Node("Porto Alegre");
        Node portoVelho = new Node("Porto Velho");
        Node recife = new Node("Recife");
        Node rioBranco = new Node("Rio Branco");
        Node rioJaneiro = new Node("Rio de Janeiro");
        Node salvador = new Node("Salvador");
        Node saoLuis = new Node("São Luis");
        Node saoPaulo = new Node("São Paulo");
        Node teresina = new Node("Teresina");
        Node vitoria = new Node("Vitória");

        portoAlegre.setAdjacencies(Collections.singletonList(
                new Edge(florianopolis, 0)
        ));

        florianopolis.setAdjacencies(Arrays.asList(
                new Edge(portoAlegre, 0),
                new Edge(curitiba, 0)
        ));

        curitiba.setAdjacencies(Arrays.asList(
                new Edge(florianopolis, 0),
                new Edge(saoPaulo, 0),
                new Edge(campoGrande, 0)
        ));

        saoPaulo.setAdjacencies(Arrays.asList(
                new Edge(curitiba, 0),
                new Edge(cuiaba, 0),
                new Edge(brasilia, 0),
                new Edge(beloHorizonte, 0),
                new Edge(rioJaneiro, 0)
        ));

        rioJaneiro.setAdjacencies(Arrays.asList(
                new Edge(saoPaulo, 0),
                new Edge(beloHorizonte, 0),
                new Edge(salvador, 0),
                new Edge(vitoria, 0)
        ));

        campoGrande.setAdjacencies(Arrays.asList(
                new Edge(curitiba, 0),
                new Edge(cuiaba, 0)
        ));

        beloHorizonte.setAdjacencies(Arrays.asList(
                new Edge(saoPaulo, 0),
                new Edge(rioJaneiro, 0),
                new Edge(brasilia, 0)
        ));

        vitoria.setAdjacencies(Collections.singletonList(
                new Edge(rioJaneiro, 0)
        ));

        cuiaba.setAdjacencies(Arrays.asList(
                new Edge(campoGrande, 0),
                new Edge(portoVelho, 0),
                new Edge(brasilia, 0),
                new Edge(saoPaulo, 0)
        ));

        brasilia.setAdjacencies(Arrays.asList(
                new Edge(goiania, 0),
                new Edge(cuiaba, 0),
                new Edge(manaus, 0),
                new Edge(palmas, 0),
                new Edge(fortaleza, 0),
                new Edge(beloHorizonte, 0),
                new Edge(saoPaulo, 0)
        ));

        goiania.setAdjacencies(Collections.singletonList(
                new Edge(brasilia, 0)
        ));

        portoVelho.setAdjacencies(Arrays.asList(
                new Edge(cuiaba, 0),
                new Edge(rioBranco, 0),
                new Edge(manaus, 0)
        ));

        rioBranco.setAdjacencies(Arrays.asList(
                new Edge(portoVelho, 0),
                new Edge(manaus, 0)
        ));

        palmas.setAdjacencies(Collections.singletonList(
                new Edge(brasilia, 0)
        ));

        manaus.setAdjacencies(Arrays.asList(
                new Edge(portoVelho, 0),
                new Edge(rioBranco, 0),
                new Edge(boaVista, 0),
                new Edge(belem, 0)
        ));

        boaVista.setAdjacencies(Collections.singletonList(
                new Edge(manaus, 0)
        ));

        belem.setAdjacencies(Arrays.asList(
                new Edge(manaus, 0),
                new Edge(macapa, 0)
        ));

        macapa.setAdjacencies(Collections.singletonList(
                new Edge(belem, 0)
        ));

        salvador.setAdjacencies(Arrays.asList(
                new Edge(aracaju, 0),
                new Edge(natal, 0),
                new Edge(fortaleza, 0)
        ));

        aracaju.setAdjacencies(Arrays.asList(
                new Edge(salvador, 0),
                new Edge(maceio, 0)
        ));

        maceio.setAdjacencies(Arrays.asList(
                new Edge(aracaju, 0),
                new Edge(recife, 0)
        ));

        recife.setAdjacencies(Arrays.asList(
                new Edge(maceio, 0),
                new Edge(joaoPessoa, 0),
                new Edge(fortaleza, 0)
        ));

        joaoPessoa.setAdjacencies(Arrays.asList(
                new Edge(recife, 0),
                new Edge(natal, 0)
        ));

        natal.setAdjacencies(Arrays.asList(
                new Edge(joaoPessoa, 0),
                new Edge(salvador, 0),
                new Edge(fortaleza, 0)
        ));

        fortaleza.setAdjacencies(Arrays.asList(
                new Edge(saoLuis, 0),
                new Edge(teresina, 0),
                new Edge(brasilia, 0),
                new Edge(salvador, 0),
                new Edge(recife, 0),
                new Edge(natal, 0)
        ));

        teresina.setAdjacencies(Collections.singletonList(
                new Edge(fortaleza, 0)
        ));

        saoLuis.setAdjacencies(Collections.singletonList(
                new Edge(fortaleza, 0)
        ));

        return Arrays.asList(aracaju, belem, beloHorizonte, boaVista, brasilia, campoGrande, cuiaba, curitiba,
                florianopolis, fortaleza, goiania, joaoPessoa, macapa, maceio, manaus, natal, palmas, portoAlegre,
                portoVelho, recife, rioBranco, rioJaneiro, salvador, saoLuis, saoPaulo, teresina, vitoria
        );
    }

}
