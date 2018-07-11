package examples.supplier;

import examples.model.Student;

import java.util.function.BiConsumer;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class TestSupplier {

    static int i = 1;
    public static Supplier<Student> studentSupplier = () -> {
        return new Student("Xzy", "ID00" + i++, "ACCOUNT");
    };

    public static IntSupplier intSupplier = () -> {
        return i++;
    };

    static BiConsumer<String, Object> consumer = (str, obj) -> {
        System.out.print(str); System.out.println(obj);
    };

    public static void main(String[] args) {
        //Student Supplier
        consumer.accept("Student Supplier: ", studentSupplier.get());
        //Integer Supplier
        consumer.accept("Integer Supplier: ", intSupplier.getAsInt());
    }
}
