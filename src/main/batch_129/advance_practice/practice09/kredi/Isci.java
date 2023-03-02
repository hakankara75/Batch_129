package main.batch_129.advance_practice.practice09.kredi;

public class Isci extends Banka {

    @Override
    public double faizHesapla(double alinacakKredi) {
        return alinacakKredi * 0.15;
    }
}