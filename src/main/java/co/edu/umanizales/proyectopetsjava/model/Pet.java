package co.edu.umanizales.proyectopetsjava.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pet {
    public Object Nodo;
    private String id;
        private String name;
        private byte age;
        private String city;
        private String breed;
        private char gender;//M:Macho , H:Hembra
        private Node head;
        public String getedad;
        public String isCity;

}