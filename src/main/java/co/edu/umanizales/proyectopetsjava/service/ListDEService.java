package co.edu.umanizales.proyectopetsjava.service;


import co.edu.umanizales.proyectopetsjava.model.Node;
import co.edu.umanizales.proyectopetsjava.model.Pet;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class ListDEService {
        private ListDEService list= new ListDEService();

        public Node getAllLinked(){
            return this.list.enlist();
        }
        public String add(Pet pet){
            this.list.add(pet);
            return "Adicionado con exito";
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

