package br.com.busca.controller;

import br.com.busca.model.Edge;
import br.com.busca.model.Node;

import java.util.*;

//https://gist.github.com/raymondchua/8064159
//https://www.youtube.com/watch?v=UwtjG1BUHJA
public class AstarController {

    public static List<Node> aStarSearch(Node source, Node goal){

        PriorityQueue<Node> queue = new PriorityQueue<>(50, Comparator.comparingDouble(i -> i.f_scores));
        Set<Node> explored = new HashSet<>();

        source.g_scores = 0;
        queue.add(source);

        boolean found = false;
        while ((!queue.isEmpty()) && (!found)){

            Node current = queue.poll();
            explored.add(current);

            if(current.value.equals(goal.value)){
                found = true;
            }

            for (Edge e : current.adjacencies){
                Node child = e.target;
                double cost = e.cost;
                double temp_g_scores = current.g_scores + cost;
                double temp_f_scores = temp_g_scores + child.h_scores;

                if ((explored.contains(child)) && (temp_f_scores >= child.f_scores)){
                    continue;
                }

                if((!queue.contains(child)) || (temp_f_scores < child.f_scores)){

                    child.parent = current;
                    child.g_scores = temp_g_scores;
                    child.f_scores = temp_f_scores;

                    queue.remove(child);
                    queue.add(child);
                }
            }
        }

        return printPath(goal);
    }

    private static List<Node> printPath(Node target){

        List<Node> path = new ArrayList<>();

        for (Node node = target; node != null; node = node.parent){
            path.add(node);
        }

        Collections.reverse(path);
        return path;
    }
}
