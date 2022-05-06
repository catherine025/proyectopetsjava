package co.edu.umanizales.proyectopetsjava.model;

import lombok.Data;

@Data
public class Node {
    private  Pet data;
    public Node next;

    public Node(Pet data) {
        this.data = data;
    }
}

