package co.edu.umanizales.proyectopetsjava.service;

import co.edu.umanizales.proyectopetsjava.model.Pet;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ListCircularS {

    private ListCircularService list;

    public String add(Pet pet) {
        this.list.add(pet);
        return "Adicionado con éxito";
    }
}



