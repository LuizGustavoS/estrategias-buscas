package br.com.busca;

import br.com.busca.controller.AstarController;
import br.com.busca.controller.DataloadController;
import br.com.busca.model.Node;

import java.util.Arrays;
import java.util.List;

public class Run {

    private static final int BOAVISTA = 3;
    private static final int PORTOALEGRE = 17;

    private static final List<Integer> DISTANCIAS_PORTOALEGRE = Arrays.asList(
            2580, 3188, 1341, 3785, 1619, 1119, 1679, 546, 376, 3213, 1497, 3066, 3341,
            2775, 3132, 3172, 2222, 0, 2706, 2977, 2814, 1123, 2303, 3142, 852, 2909, 1536);

    public static void main(String[] args) {

        try {
            final List<Node> nodes = DataloadController.carregarRotasTerrestres(DISTANCIAS_PORTOALEGRE);

            Node nodeInicio = nodes.get(BOAVISTA);
            System.out.println("Ponto de Partida: " + nodeInicio);

            Node nodeFinal = nodes.get(PORTOALEGRE);
            System.out.println("Ponto de chegada: " + nodeFinal);

            List<Node> result = AstarController.aStarSearch(nodeInicio, nodeFinal);
            System.out.println("Melhor caminho: " + result);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
