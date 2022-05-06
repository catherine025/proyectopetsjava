package co.edu.umanizales.proyectopetsjava.controller;


import co.edu.umanizales.proyectopetsjava.model.Average;
import co.edu.umanizales.proyectopetsjava.model.Student;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
@RestController
@Data
@RequestMapping(path = "student")
public class StudentController<StudentService> {
    @Autowired
    private StudentService studentService;


        @GetMapping()
        public List<Student> getAllStudents()
        {
            return studentService.getAllStudents();
        }

        @GetMapping(path="/percentage/{gender}")
        public float getPercentageByGender(@PathVariable char gender){
            return studentService.getPercentageByGender(gender);
        }

        @GetMapping(path="/students/work")
        public List<Student> getStudentsWork()
        {
            return studentService.getStudentsWork();

        }

        @GetMapping(path="/students work/{gender}/{salary}")
        public List<Student> getStudentsWorkBysalary
                (@PathVariable char gender,
                 @PathVariable double salary){
            return studentService.getStudentsWorkBysalary(gender,salary);
        }

        @GetMapping(path = "/mayor/salaries")
        public List<Student> getMayorBetweenSalaries()
        {
            return studentService.getMayorSalary();

        }

        @GetMapping(path="/between/{min_salary}/{max_salary}")
        public List<Student> getStudentsBetweenSalaries(@PathVariable double min_salary, @PathVariable double max_salary){
            return studentService.getStudentsBetweenSalaries(min_salary, max_salary);
        }

        @GetMapping(path = "/average")
        public List<Average> getAverageSalaries()
        {
            return studentService.getAverageSalaries();

        }

        @GetMapping(path = "/rural/{first_number}")
        public List<Student> getRuralStudent(@PathVariable  char first_number) {
            return studentService.getRuralStudent(first_number);
        }
    }
}
