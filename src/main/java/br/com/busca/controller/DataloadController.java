package br.com.busca.controller;

import br.com.busca.model.Edge;
import br.com.busca.model.Node;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class DataloadController {

    public static List<Node> loadNodes() throws Exception {

        final String contentEstados = Files.readString(Path.of(ClassLoader
                .getSystemResource("capitais-aracaju.json")
                .toURI()));

        final List<String> listCidades = new ObjectMapper()
                .readValue(contentEstados, List.class);

        List<Node> listNode = new ArrayList<>();
        for (String cidade : listCidades) {
            String[] split = cidade.split(":");
            listNode.add(new Node(split[0], Integer.parseInt(split[1])));
        }

        loadEdges(listNode);
        return listNode;
    }

    private static void loadEdges(List<Node> listNodes) throws Exception {

        final String contentDistancias = Files.readString(Path.of(ClassLoader
                .getSystemResource("distancias-terrestes.json")
                .toURI()));

        final Map<String, Integer> mapDistancia = new ObjectMapper().readValue(contentDistancias, HashMap.class);

        for (String s : mapDistancia.keySet()) {

            final String[] split = s.split(":");
            final Optional<Node> nodePai = listNodes.stream().filter(n -> n.getValue().equals(split[0])).findFirst();
            final Optional<Node> nodeFilho = listNodes.stream().filter(n -> n.getValue().equals(split[1])).findFirst();

            if (nodePai.isEmpty()){
                throw new Exception("Cidade ? não encontrada".replace("?", String.valueOf(split[0])));
            }if (nodeFilho.isEmpty()){
                throw new Exception("Cidade ? não encontrada".replace("?", String.valueOf(split[1])));
            }

            nodePai.get().getAdjacencies().add(new Edge(nodeFilho.get(), mapDistancia.get(s)));
        }
    }

}
