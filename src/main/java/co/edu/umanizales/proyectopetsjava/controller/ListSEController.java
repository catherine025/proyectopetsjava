package co.edu.umanizales.proyectopetsjava.controller;

import co.edu.umanizales.proyectopetsjava.model.Node;
import co.edu.umanizales.proyectopetsjava.model.Pet;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Data
public class ListSeController {
        @Autowired
        private ListSeController listSeService;

        @GetMapping
        public Node getAllLinked() {
            return listSeService.getAllLinked();

        }

        @PostMapping(path = "/tostart")
        public String createPetStart(@RequestBody Pet pet) {
            return listSeService.addStart(pet);

        }

        @PostMapping(path = "/toposition/{position}")
        public String createPetPosition(@PathVariable int position,
                                        @RequestBody Pet pet) {
            return listSeService.addStart(pet);

        }

    private String addStart(Pet pet) {
    }

    @GetMapping(path = "/deletebyposition/{position}")
        public String deletePetPosition(@PathVariable int position)
        {
            return listSeService.deleteToposition(position);
        }

    private String deleteToposition(int position) {
    }

    @GetMapping(path = "/invert")
        public String invert(){
            return listSeService.invert();

        }
        @GetMapping(path = "/toexchange")
        public String toexchange()
        {
            return listSeService.toExchange();
        }

    private String toExchange() {
    }


    @GetMapping(path = "/mixbygender")
        public String mixByGender()
        {
            return listSeService.mixByGender();

        }
        @PostMapping(path = "/loadpets")
        public String loadPets(@RequestBody List<Pet> pets)
        {
            for(Pet pet:pets)
            {
                listSeService.add(pet);
            }
            return "Mascotas cargadas exitosamente";

        }

    private void add(Pet pet) {
    }


}



