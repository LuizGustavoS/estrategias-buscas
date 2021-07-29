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
                new Edge(florianopolis, 476)
        ));

        florianopolis.setAdjacencies(Arrays.asList(
                new Edge(portoAlegre, 476),
                new Edge(curitiba, 300)
        ));

        curitiba.setAdjacencies(Arrays.asList(
                new Edge(florianopolis, 300),
                new Edge(saoPaulo, 408),
                new Edge(campoGrande, 991)
        ));

        saoPaulo.setAdjacencies(Arrays.asList(
                new Edge(curitiba, 408),
                new Edge(cuiaba, 1614),
                new Edge(brasilia, 1015),
                new Edge(beloHorizonte, 586),
                new Edge(rioJaneiro, 429)
        ));

        rioJaneiro.setAdjacencies(Arrays.asList(
                new Edge(saoPaulo, 429),
                new Edge(beloHorizonte, 434),
                new Edge(salvador, 1649),
                new Edge(vitoria, 521)
        ));

        campoGrande.setAdjacencies(Arrays.asList(
                new Edge(curitiba, 991),
                new Edge(cuiaba, 694)
        ));

        beloHorizonte.setAdjacencies(Arrays.asList(
                new Edge(saoPaulo, 586),
                new Edge(rioJaneiro, 434),
                new Edge(brasilia, 716)
        ));

        vitoria.setAdjacencies(Collections.singletonList(
                new Edge(rioJaneiro, 521)
        ));

        cuiaba.setAdjacencies(Arrays.asList(
                new Edge(campoGrande, 694),
                new Edge(portoVelho, 1456),
                new Edge(brasilia, 1366),
                new Edge(saoPaulo, 1614)
        ));

        brasilia.setAdjacencies(Arrays.asList(
                new Edge(goiania, 209),
                new Edge(cuiaba, 1366),
                new Edge(manaus, 3490),
                new Edge(palmas, 973),
                new Edge(fortaleza, 2200),
                new Edge(beloHorizonte, 716),
                new Edge(saoPaulo, 1015)
        ));

        goiania.setAdjacencies(Collections.singletonList(
                new Edge(brasilia, 209)
        ));

        portoVelho.setAdjacencies(Arrays.asList(
                new Edge(cuiaba, 1456),
                new Edge(rioBranco, 544),
                new Edge(manaus, 901)
        ));

        rioBranco.setAdjacencies(Arrays.asList(
                new Edge(portoVelho, 544),
                new Edge(manaus, 1445)
        ));

        palmas.setAdjacencies(Collections.singletonList(
                new Edge(brasilia, 973)
        ));

        manaus.setAdjacencies(Arrays.asList(
                new Edge(portoVelho, 901),
                new Edge(rioBranco, 1445),
                new Edge(boaVista, 785),
                new Edge(belem, 5298),
                new Edge(brasilia, 3490)
        ));

        boaVista.setAdjacencies(Collections.singletonList(
                new Edge(manaus, 785)
        ));

        belem.setAdjacencies(Arrays.asList(
                new Edge(manaus, 5298),
                new Edge(macapa, 520)
        ));

        macapa.setAdjacencies(Collections.singletonList(
                new Edge(belem, 520)
        ));

        salvador.setAdjacencies(Arrays.asList(
                new Edge(aracaju, 356),
                new Edge(natal, 1126),
                new Edge(fortaleza, 1389),
                new Edge(rioJaneiro, 1649)
        ));

        aracaju.setAdjacencies(Arrays.asList(
                new Edge(salvador, 356),
                new Edge(maceio, 294)
        ));

        maceio.setAdjacencies(Arrays.asList(
                new Edge(aracaju, 294),
                new Edge(recife, 285)
        ));

        recife.setAdjacencies(Arrays.asList(
                new Edge(maceio, 285),
                new Edge(joaoPessoa, 120),
                new Edge(fortaleza, 800)
        ));

        joaoPessoa.setAdjacencies(Arrays.asList(
                new Edge(recife, 120),
                new Edge(natal, 185)
        ));

        natal.setAdjacencies(Arrays.asList(
                new Edge(joaoPessoa, 185),
                new Edge(salvador, 1126),
                new Edge(fortaleza, 537)
        ));

        fortaleza.setAdjacencies(Arrays.asList(
                new Edge(saoLuis, 1070),
                new Edge(teresina, 634),
                new Edge(brasilia, 2200),
                new Edge(salvador, 1389),
                new Edge(recife, 800),
                new Edge(natal, 537)
        ));

        teresina.setAdjacencies(Collections.singletonList(
                new Edge(fortaleza, 634)
        ));

        saoLuis.setAdjacencies(Collections.singletonList(
                new Edge(fortaleza, 1070)
        ));

        return Arrays.asList(aracaju, belem, beloHorizonte, boaVista, brasilia, campoGrande, cuiaba, curitiba,
                florianopolis, fortaleza, goiania, joaoPessoa, macapa, maceio, manaus, natal, palmas, portoAlegre,
                portoVelho, recife, rioBranco, rioJaneiro, salvador, saoLuis, saoPaulo, teresina, vitoria
        );
    }

}
