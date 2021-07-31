package br.com.busca.controller;

import br.com.busca.model.Edge;
import br.com.busca.model.Node;

import java.util.*;

//https://www.youtube.com/watch?v=-kSOj19gyPU
public class GulosaController {

    public static List<Node> gulosaSearch(Node source, Node goal){

        Set<Node> explored = new HashSet<>();

        PriorityQueue<Node> queue = new PriorityQueue<>(20, Comparator.comparingDouble(i -> i.f_scores));

        source.g_scores = 0;

        queue.add(source);

        boolean found = false;

        while((!queue.isEmpty())&&(!found)){

            //the node in having the lowest f_score value
            Node current = queue.poll();

            explored.add(current);

            //goal found
            if(current.value.equals(goal.value)){
                found = true;
            }

            //check every child of current node
            for(Edge e : current.adjacencies){
                Node child = e.target;
                double temp_g_scores = current.g_scores;

                //euristica + real
                double temp_f_scores = temp_g_scores + child.h_scores;

                /*if child node has been evaluated and
                the newer f_score is higher, skip*/
                if((explored.contains(child)) && (temp_f_scores >= child.f_scores)){
                    continue;
                }

                /*else if child node is not in queue or
                newer f_score is lower*/

                else if((!queue.contains(child)) || (temp_f_scores < child.f_scores)){

                    child.parent = current;
                    child.g_scores = temp_g_scores;
                    child.f_scores = temp_f_scores;

                    if(queue.contains(child)){
                        queue.remove(child);
                    }

                    queue.add(child);
                }
            }
        }

        return printPath(goal);
    }

    public static List<Node> printPath(Node target){

        List<Node> path = new ArrayList<>();
        for(Node node = target; node!=null; node = node.parent){
            path.add(node);
        }

        Collections.reverse(path);
        return path;
    }
}
