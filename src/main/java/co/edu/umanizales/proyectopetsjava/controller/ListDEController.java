package co.edu.umanizales.proyectopetsjava.controller;



import co.edu.umanizales.proyectopetsjava.model.Node;
import co.edu.umanizales.proyectopetsjava.model.Pet;
import co.edu.umanizales.proyectopetsjava.service.ListDEService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.awt.*;

@Data
public class ListDEController {

        @Autowired
        private ListDEService listDEService;

        @GetMapping
        public Node getAllLinked(){
            return listDEService.getAllLinked();
        }

        @PostMapping
        public String createPet(@RequestBody Pet pet)
        {
            return listDEService.add(pet);
        }

        @PostMapping(path="/tostart")
        public String createPetToStart(@RequestBody Pet pet){
            return listDEService.addToStart(pet);
        }

        @GetMapping(path = "/invert")
        public String invertList()
        {
            return listDEService.invert();
        }

        @PostMapping(path = "/loadpets")
        public String loadPets(@RequestBody List pets)
        {
            for(Pet pet:pets)
            {
                listDEService.add(pet);
            }
            return "Mascotas cargadas exitosamente";

        }
    }


}
