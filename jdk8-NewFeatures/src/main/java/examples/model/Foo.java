package examples.model;

import org.springframework.context.annotation.Lazy;

import java.util.List;
import java.util.Map;

public class Foo {

    Bar bar;
    Bar bar1;
    List<String> str;
    Map<String, String> map;

    public Foo(@Lazy Bar bar, @Lazy Bar bar1) {
        this.bar = bar;
        this.bar1= bar1;
        System.out.println(bar + "____" + bar1);
    }

   /* public Foo(List<String> str) {
        this.str = str;
        //this.map=map;
    }*/

    public void setBar(Bar bar) {
        this.bar = bar;
    }

    public void setBar1(Bar bar1) {
        this.bar1 = bar1;
    }

    public void setStr(List<String> str) {
        this.str = str;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "bar=" + bar +
                ", bar1=" + bar1 +
                ", str=" + str +
                ", map=" + map +
                '}';
    }
}
