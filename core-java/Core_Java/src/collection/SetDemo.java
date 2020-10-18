package hello.core.java;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        Set<String> set = new HashSet();
        set.add("1");
        set.add("2");
        set.add("1");
        set.add("1");
        set.add("1");
        set.forEach(System.out::println);

        set.remove("1");
        set.forEach(System.out::println);

        set.removeAll(set);
        set.forEach(System.out::println);

        List<String> list = new ArrayList();
        list.add("3");
        list.add("4");
        set.addAll(list);
        set.forEach(System.out::println);

        System.out.println(set.contains("3"));

        Set set2 = new HashSet();
        set2.add("5");
        System.out.println(set.containsAll(set2));

        set2.add("4");
        System.out.println(set.containsAll(set2));

        set.remove("5");
        System.out.println(set.containsAll(set2));

        System.out.println(set.isEmpty());

    }
}
