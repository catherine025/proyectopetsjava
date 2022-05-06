package co.edu.umanizales.proyectopetsjava.service;

import co.edu.umanizales.proyectopetsjava.model.Average;
import co.edu.umanizales.proyectopetsjava.model.Student;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Data
@Service
public class StudentService {
    private List<Student> students;

        public StudentService() {

            students = new ArrayList<>();
            students.add(new Student("1234555",
                    "Carlos Loaiza", 2000000, 'M',
                    true, "3016052808", true));
            students.add(new Student("2343434",
                    "Lucas Villegas", 10000, 'M',
                    true, "3057707378", true));
            students.add(new Student("23434343",
                    "Catherine Betancurt", 700000, 'F',
                    false, "3057707378", false));


        }

        public List<Student> getAllStudents() {
            return students;
        }

        public float getPercentageByGender(char gender) {

            int count = 0;
            for (Student student : students) {
                if (student.getGender() == gender) {

                    count++;
                }

            }
            return count / (float) students.size();
        }

        public List<Student> getStudentsWork() {
            List<Student> studentsWork = new ArrayList<>();
            for (Student student : students) {
                if (student.isJob() && student.getSalary() > 1000000) {
                    studentsWork.add(student);
                }
            }
            return studentsWork;
        }

        public List<Student> getStudentsWorkBysalary(char gender, double salary) {
            List<Student> studentsWorkSalary = new ArrayList<>();
            for (Student student : students) {
                if (student.isJob() && student.getGender() == gender && student.getSalary() >= salary) {
                    studentsWorkSalary.add(student);
                }

            }
            return studentsWorkSalary;
        }

        public List<Student> getMayorSalary() {
            List<Student> mayorSalary = new ArrayList<>();

            Student M_Student = null;
            Student F_Student = null;
            for (Student student : students) {
                if (student.isJob()) {
                    if ((student.getGender() == 'M' && M_Student == null)
                            || (student.getGender() == 'M' && student.getSalary() >
                            M_Student.getSalary())) {
                        M_Student = student;
                    }
                    if ((student.getGender() == 'F' && F_Student == null)
                            || (student.getGender() == 'F' && student.getSalary() >
                            F_Student.getSalary())) {
                        F_Student = student;

                    }

                }

            }
            if (M_Student != null) {
                mayorSalary.add(M_Student);
            }
            if (F_Student != null) {
                mayorSalary.add(F_Student);
            }
            return mayorSalary;
        }

        public List<Student> getStudentsBetweenSalaries(double min_salary, double max_salary) {
            List<Student> studentsBetweenSalaries = new ArrayList<>();
            for (Student student : students) {
                if (student.isJob() && student.getSalary() >= min_salary && student.getSalary() <= max_salary) {
                    studentsBetweenSalaries.add(student);
                }
            }
            return studentsBetweenSalaries;
        }

        public List<Average> getAverageSalaries(){
            List<Average> averageSalaries = new ArrayList<>();
            int Men_Count = 0;
            int Women_Count = 0;
            double total_men_salary = 0;
            double total_women_salary = 0;
            for (Student student : students) {
                if (student.getGender() == 'M' && student.isJob()) {
                    Men_Count++;
                    total_men_salary = total_men_salary + student.getSalary();
                }
                if (student.getGender() == 'F' && student.isJob()) {
                    Women_Count++;
                    total_women_salary = total_women_salary + student.getSalary();

                }
            }
            if(Men_Count != 0){
                averageSalaries.add(new Average("Hombres",(total_men_salary/ Men_Count )));
            }
            if(Women_Count !=0){
                averageSalaries.add(new Average("Mujeres",(total_women_salary/ Women_Count)));
            }
            return averageSalaries;

        }

        public List<Student> getRuralStudent(char id){
            List<Student> ruralStudents = new ArrayList<>();
            for(Student student: students){
                char first_number =  student.getIdentification().charAt(0);
                //System.out.println(first_number);
                if(first_number == id && student.isRural()){
                    ruralStudents.add(student);
                }
            }
            return ruralStudents;
        }
    }


