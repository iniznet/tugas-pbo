package id.my.niznet.tugas2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, BangunDatar> bentuk = new HashMap<>();

        System.out.println("Program Menghitung Luas dan Keliling Bangun Datar");

        System.out.println("Segitiga");
        System.out.print("Masukkan alas: ");
        double alas = input.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi = input.nextDouble();
        bentuk.put("Segitiga", new Segitiga(alas, tinggi));
        System.out.println();

        System.out.println("Persegi Panjang");
        System.out.print("Masukkan panjang: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar: ");
        double lebar = input.nextDouble();
        bentuk.put("Persegi Panjang", new PersegiPanjang(panjang, lebar));
        System.out.println();

        System.out.println("Lingkaran");
        System.out.print("Masukkan jari-jari: ");
        double jariJari = input.nextDouble();
        bentuk.put("Lingkaran", new Lingkaran(jariJari));
        System.out.println();

        System.out.println("Persegi");
        System.out.print("Masukkan sisi: ");
        double sisi = input.nextDouble();
        bentuk.put("Persegi", new Persegi(sisi));
        System.out.println();

        input.close();
        System.out.println("==================================");
        System.out.println();
        System.out.println("Hasil");

        for (String key : bentuk.keySet()) {
            System.out.println(key);
            System.out.println("Luas: " + bentuk.get(key).luas());
            System.out.println("Keliling: " + bentuk.get(key).keliling());
        }
    }
}
