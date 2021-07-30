package br.com.busca;

import br.com.busca.controller.AstarController;
import br.com.busca.controller.DataloadController;
import br.com.busca.model.Node;

import java.util.Arrays;
import java.util.List;

public class Run {

    private static final int BOAVISTA = 3;
    private static final int MANAUS = 14;
    private static final int RIO = 21;

    private static final int PORTOALEGRE = 17;
    private static final int SAOPAULO = 24;
    private static final int FORTALEZA = 9;

    private static final List<Integer> DISTANCIAS_PORTOALEGRE = Arrays.asList(
            2580, 3188, 1341, 3785, 1619, 1119, 1679, 546, 376, 3213, 1497, 3066, 3341,
            2775, 3132, 3172, 2222, 0, 2706, 2977, 2814, 1123, 2303, 3142, 852, 2909, 1536);

    private static final List<Integer> DISTANCIAS_SAOPAULO = Arrays.asList(
            1731, 2463, 489, 3300, 873, 894, 1326, 338, 489, 2368, 810, 2216, 2664, 1928,
            2689, 2320, 1493, 852, 2463, 2128, 2704, 357, 1453, 2348, 0, 2091, 741);

    private static final List<Integer> DISTANCIAS_FORTALEZA = Arrays.asList(
            815, 1133, 1893, 2562, 1687, 2547, 2329, 2670, 2857, 0, 1854, 555, 1451, 730,
            2383, 435, 1300, 3213, 2855, 629, 3300, 2190, 1028, 652, 2368, 495, 1855);

    public static void main(String[] args) {

        List<Node> list1 = DataloadController.carregarRotasTerrestres();

        //DfsController.dfs(list1.get(BOAVISTA), list1.get(PORTOALEGRE));
        DijkstraAlgo.computePaths(list1.get(MANAUS), list1.get(SAOPAULO));


/*        carregarDistanciaEuristica(list1, DISTANCIAS_PORTOALEGRE);
        testarAstar(list1.get(BOAVISTA), list1.get(PORTOALEGRE));

        List<Node> list2 = DataloadController.carregarRotasTerrestres();
        carregarDistanciaEuristica(list2, DISTANCIAS_SAOPAULO);
        testarAstar(list2.get(MANAUS), list2.get(SAOPAULO));

        List<Node> list3 = DataloadController.carregarRotasTerrestres();
        carregarDistanciaEuristica(list3, DISTANCIAS_FORTALEZA);
        testarAstar(list3.get(RIO), list3.get(FORTALEZA));*/
    }

    private static void testarAstar(Node nodoInicio, Node nodoFinal){

        List<Node> result = AstarController.aStarSearch(nodoInicio, nodoFinal);
        System.out.println("Ponto de Partida: " + nodoInicio);
        System.out.println("Ponto de chegada: " + nodoFinal);
        System.out.println("Melhor caminho: " + result);
        System.out.println("------------------------------------------------");
    }

    private static void carregarDistanciaEuristica(List<Node> listCidades, List<Integer> listDistancias){
        for (int i = 0; i < listCidades.size(); i++) {
            listCidades.get(i).setH_scores(listDistancias.get(i));
        }
    }

}
