package main.batch_129.projects.yiyecekotomati;

public class Test01  implements L {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(L.x);
        cat.eat();
    }
    @Override
    public void eat() {
        System.out.println("Cats like cheese");
    }
}
