package examples;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FolderGetAllFiles {

    public static void main(String[] args) {
        Arrays.stream(new File("/home/cts1/Desktop/R").listFiles()).map(file -> file.getName()).collect(Collectors.toList()).
                forEach(fileName -> System.out.println(fileName));
    }
}
