package br.com.busca.model;

public class Edge {

    public final double cost;

    public final Node target;

    public double getCost() {
        return cost;
    }

    public Edge(Node targetNode, double costVal){
        target = targetNode;
        cost = costVal;
    }

}
