package co.edu.umanizales.proyectopetsjava.model;

import lombok.AllArgsConstructor;
import lombok.Data;


import java.util.ArrayList;
import java.util.List;

@Data


@AllArgsConstructor
public class ListCircularPet {

    public void addStart(Pet pet) {

        if (head != null) {
            pet.Nodo new = new pet.Nodo();
            new.pet = pet;
            pet.Nodo aux = head.next;
            new.next = aux;
            aux.next = new;
            new.next = new;
            new.next = head;
            head = new;
            count++;
        }
    }


    public void add(Pet pet) {
        Node temp = null;
        if (this.head == null) {
            this.head == new Node(pet);
        } else {
            temp = this.head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
        }
        temp.setNext(new Node(pet));
    }


    public List<Average> getAverageCuidad() {
        List<Average> averageCuidad = new ArrayList<>();
        int Cuidad = 0;
        int edad = 0;
        double total_Cuidad = 0;
        double total_edad = 0;
        Pet[] pet;
        int edad_Count;
        for (Pet pet : pet) {
            if (pet.getCity() == 'C' && pet.getCity()) {
                edad_Count++;
                total_Cuidad = total_edad + pet.getCity();
            }
            if (pet.getedad() == 'E' && Pet.isCity()) {
                int total_edad_Count;
                total_edad_Count++;
                total_edad_Count = total_edad + pet.getedad();

            }
        }


        int Cuidad_Count;
        if (edad_Count != 0) {

            averageCuidad.add(new Average("Ciudad", (total_Cuidad / Cuidad_Count)));
        }
        if (Cuidad_Count != 0) {
            edad(new Average("edades", (total_edad / edad_Count)));
        }

        return count++;

    }






    boolean head;
    public boolean isHead() {
        return head;
    }
}

