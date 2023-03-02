package main.batch_129.day38lambda;

import java.util.stream.IntStream;

public class d {
    public static void main(String[] args) {

        IntStream.rangeClosed(1, 100).filter(Utils::isNumberEven).forEach(t -> System.out.println(t + ""));
        return;


    }
    }

