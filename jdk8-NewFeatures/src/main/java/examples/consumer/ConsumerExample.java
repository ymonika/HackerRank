package examples.consumer;

import examples.model.Student;
import examples.supplier.TestSupplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerExample {

    static Consumer<Student>  consumer = student -> student.setAttendance(student.getAttendance()+ 5.00);

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        Supplier<Student> studentSupplier = TestSupplier.studentSupplier;

        for(int i=0; i <10; i++){
            students.add(studentSupplier.get());
        }
        students.forEach(student -> consumer.accept(student));

        System.out.println(students);

    }

}
