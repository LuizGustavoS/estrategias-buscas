package br.com.busca;

import br.com.busca.controller.AstarController;
import br.com.busca.controller.DataloadController;
import br.com.busca.model.Node;

import java.util.Arrays;
import java.util.List;

public class Run {

    private static final List<Integer> CIDADE1_CIDADE2 = Arrays.asList();

    public static void main(String[] args) {

        try {
            List<Node> nodes = DataloadController.carregarRotasTerrestres(CIDADE1_CIDADE2);

            Node nodeInicio = nodes.get(7);
            Node nodeFinal = nodes.get(0);

            System.out.println(nodeInicio);
            System.out.println(nodeFinal);

            List<Node> result = AstarController.aStarSearch(nodeInicio, nodeFinal);
            System.out.println("Path: " + result);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
