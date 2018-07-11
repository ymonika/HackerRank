package examples.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

/*
BiPredicateExample :
passing function as arguments

 */

public class BiPredicateExample {

    static boolean moreThanFifty(Integer i1, Integer i2) {
        return i1 + i2 > 50;
    }

    public static void main(String[] args) {

        List list = Arrays.asList(12, 5, 45, 18, 33, 24, 40);

        System.out.println(findNumbers(list, BiPredicateExample::moreThanFifty));
        System.out.println(findNumbers(list, (i1, i2) -> moreThanFifty(i1, i2)));
        System.out.println(findNumbers(list, new BiPredicate<Integer, Integer>() {
                    @Override
                    public boolean test(Integer i1, Integer i2) {
                        return moreThanFifty(i1, i2);
                    }
                })
        );

    }

    public static List<Integer> findNumbers(List<Integer> list, BiPredicate<Integer, Integer> predicate) {
        return list.stream().filter(i -> predicate.test(i, i + 10)).collect(Collectors.toList());//[45, 33, 24, 40]
    }


}
