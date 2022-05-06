package co.edu.umanizales.proyectopetsjava.controller;

import co.edu.umanizales.proyectopetsjava.model.Node;
import co.edu.umanizales.proyectopetsjava.model.Pet;
import co.edu.umanizales.proyectopetsjava.service.ListCircularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestBody
@RequestMapping(path = "/listsecircular")
public class ListCircularController {
    @Autowired
    private ListCircularService listCircularService;

    @GetMapping
    public Node getAllLinked(){
        return listCircularService.getAllLinked();
    }

    @PostMapping
    public String createPet(@RequestBody Pet pet)
    {
        return listCircularService.add(pet);
    }

    @PostMapping(path="/tostart")
    public String createPetToStart(@RequestBody Pet pet){
        return listCircularService.addToStart(pet);
    }

    @GetMapping(path = "/invert")
    public String invertList()
    {
        return listCircularService.invert();
    }

    @PostMapping(path = "/loadpets")
    public String loadPets(@RequestBody List pets)
    {
        for(Pet pet:pets)
        {
            listCircularService.add(pet);
        }
        return "Mascotas cargadas exitosamente";

    }
}