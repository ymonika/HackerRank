package examples.predicate;

import examples.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Student> passedStudents = stud -> stud.getAttendance() >= 40 && stud.getDept().equals("IT");
    static Consumer<Student> printStudent = System.out::println;

    private List<Student> predicateOnStudents(List<Student> students, Predicate<Student> predicate) {

       List<Student> passedStudents = new ArrayList<>();
        for (Student student : students)
            if (predicate.test(student)) {
                passedStudents.add(student);
            }
       return passedStudents;
    }

    public static void main(String[] args) {

        List<Student> studs = Arrays.asList(new Student("Abc", "ZID001", "IT"), new Student("Def", "AID002", "IT"), new Student("Ghi", "BID003", "MECH"));
        studs.sort(Student::compareTo);
        studs.forEach(student -> {
            if(passedStudents.test(student)) {
                printStudent.accept(student);
            }
        });

    }

}

