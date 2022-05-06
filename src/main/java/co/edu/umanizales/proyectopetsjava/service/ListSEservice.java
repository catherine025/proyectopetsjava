package co.edu.umanizales.proyectopetsjava.service;

import co.edu.umanizales.proyectopetsjava.model.ListSE;
import co.edu.umanizales.proyectopetsjava.model.Node;
import co.edu.umanizales.proyectopetsjava.model.Pet;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class ListSEservice {
    private ListSE list = new ListSE();

    public Node getAllLinked() {
        return this.list.getHead();

    }

    public String add(Pet pet) {
        this.list.add(pet);
        return "Adicionado con éxito";

    }

    public String addStart(Pet pet) {
        this.list.addStart(pet);
        return "Adicionado con éxito";
    }

    public String addToPosition(int position, Pet pet) {
        try {
            this.list.addToPosition(position, pet);
            return "Adicionado con éxito";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public String deleteToPosition(int position) {
        try {
            this.list.deleteToPosition(position);
            return "Eliminado con éxito";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public String invert() {
        try {
            this.list.invert();
            return "Invertido con éxito";
        } catch (Exception e) {
            return e.getMessage();

        }
    }
    public String toExchange()
    {
        try {
            this.list.toExchange();
            return "Intercambio realizado";
        }
        catch (Exception e)
        {
            return e.getMessage();
        }
    }
    public String mixByGender()
    {
        try {
            this.list.mixByGender();
            return "Se ha intercalado la lista exitosamente";

        } catch (Exception e ){
            return e.getMessage();
        }



    }



}

