package br.com.busca.model;

import java.util.ArrayList;
import java.util.List;

public class Node {

    public final String value;

    public double h_scores;

    public double g_scores;
    
    public double f_scores = 0;

    public Node parent;

    public List<Edge> adjacencies = new ArrayList<>();

    public Node(String val){
        this.value = val;
    }

    public void setH_scores(double h_scores) {
        this.h_scores = h_scores;
    }

    public void setAdjacencies(List<Edge> adjacencies) {
        this.adjacencies = adjacencies;
    }

    public String toString(){
        return value;
    }

}
