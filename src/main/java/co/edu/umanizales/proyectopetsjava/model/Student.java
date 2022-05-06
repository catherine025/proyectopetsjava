package co.edu.umanizales.proyectopetsjava.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private String identification;
    private String name;
    private double salary;
    private char gender;
    private boolean job;
    private String phone;
    private boolean rural;

    //Atributos de Clase
    private static String UNIVERSITY;
}
