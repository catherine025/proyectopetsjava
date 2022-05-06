package co.edu.umanizales.proyectopetsjava.service;

import co.edu.umanizales.proyectopetsjava.model.Node;
import co.edu.umanizales.proyectopetsjava.model.Pet;
import lombok.Data;

@Data
public class ListCircularService {
        private co.edu.umanizales.proyectopetsjava.model.ListCircularService List = new co.edu.umanizales.proyectopetsjava.model.ListCircularService();
    private ListCircularService list;

    public Node getAllLinked(){
            return this.list.enlist();
        }

    private Node enlist() {
    }

    public String add(Pet pet){
            this.list.add(pet);
            return "Adicionado con éxito";
        }

        public String addToStart(Pet pet){
            this.list.addToStart(pet);
            return "Adicionado con éxito";
        }

        public String invert()
        {
            try {
                this.list.invert();
                return "Invertido con éxito.";
            }
            catch (Exception e)
            {
                return e.getMessage();
            }
        }


    }

