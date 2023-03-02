package main.batch_129.day19listvarargs;

import java.util.ArrayList;
import java.util.List;

public class C01_List {
    public C01_List() {
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList();
        names.add("Hakan");
        names.add("Yunus");
        names.add("Ayse");
        names.add("Zisan");
        names.add("Sevcan");
        names.add("Omer");
        List<String> males = new ArrayList();
        males.add("Hakan");
        males.add("Yunus");
        males.add("Ali");
        names.retainAll(males);
        System.out.println("names: " + names);
        System.out.println("males: " + males);
        List<String> name = new ArrayList();
        name.add("Haki");
        name.add("Yunis");
        name.add("Ayfer");
        name.add("Ziver");
        name.add("Sevim");
        name.add("Osman");
        System.out.println(name.subList(1, 3));
    }
}
