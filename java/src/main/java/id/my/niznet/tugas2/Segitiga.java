package id.my.niznet.tugas2;

public class Segitiga implements BangunDatar {
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
        return (alas * tinggi) / 2;
    }

    @Override
    public double keliling() {
        return 0;
    }
}
