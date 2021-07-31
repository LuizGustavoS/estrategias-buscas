package br.com.busca;

import br.com.busca.controller.AstarController;
import br.com.busca.controller.DataloadController;
import br.com.busca.controller.GulosaController;
import br.com.busca.model.Edge;
import br.com.busca.model.Node;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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

        testarAlgoritmos(DISTANCIAS_PORTOALEGRE, BOAVISTA, PORTOALEGRE);
        testarAlgoritmos(DISTANCIAS_SAOPAULO, MANAUS, SAOPAULO);
        testarAlgoritmos(DISTANCIAS_FORTALEZA, RIO, FORTALEZA);
    }

    private static void testarAlgoritmos(List<Integer> listEu, int inicio, int termino){

        final List<Node> list = DataloadController.carregarRotasTerrestres(listEu);
        final Node nodoInicial = list.get(inicio);
        final Node nodoFinal = list.get(termino);

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Teste de " + nodoInicial + " à " + nodoFinal + ". Distancia aérea de " + nodoInicial.h_scores);

        List<Node> resultAstar = AstarController.aStarSearch(nodoInicial, nodoFinal);
        List<Node> resultGulosa = GulosaController.gulosaSearch(nodoInicial, nodoFinal);

        System.out.println("Resultado AEstrela: " + resultAstar + ". Distancia terrestre de " + calculaDistancia(resultAstar));
        System.out.println("Resultado Gulosa:   " + resultGulosa + ". Distancia terrestre de " + calculaDistancia(resultGulosa));
    }

    private static double calculaDistancia(List<Node> list){

        double total = 0;
        for (int i = 0; i < list.size() -1; i++) {
            int finalI = i;
            Optional<Edge> edge = list.get(i + 1).adjacencies.stream()
                    .filter(a -> a.target.equals(list.get(finalI)))
                    .findFirst();

            if (edge.isPresent()){
                total = total + edge.get().getCost();
            }
        }

        return total;
    }

}
