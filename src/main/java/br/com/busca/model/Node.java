package br.com.busca.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Node {

    public final String value;

    public double g_scores;

    public double h_scores;

    public double f_scores = 0;

    public Node parent;

    public List<Edge> adjacencies = new ArrayList<>();

    public Node(String val){
        this.value = val;
    }

    public Node(String val, double hVal){
        this.value = val;
        this.h_scores = hVal;
    }

    public String toString(){
        return value;
    }

}
