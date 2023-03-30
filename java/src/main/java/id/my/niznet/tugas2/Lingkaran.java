package id.my.niznet.tugas2;

public class Lingkaran implements BangunDatar {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double luas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public double keliling() {
        return 2 * Math.PI * jariJari;
    }
}
