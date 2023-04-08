package id.my.niznet.tugas1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> Mahasiswas = new ArrayList<>();
        ArrayList<Dosen> Dosens = new ArrayList<>();

        String[] mahasiswaNims = {"111", "222", "333", "444", "555"};
        String[] mahasiswaNames = {"Bayu", "Beni", "Reza", "Rahmat", "Roni"};
        String[] mahasiswaJurusan = {"Informatika", "Kimia", "Filsafat", "Biologi", "Matematika"};

        String[] dosenNidns = {"111", "222", "333", "444", "555"};
        String[] dosenNames = {"Agung", "Bobon", "Candra", "Deden", "Endra"};
        String[] dosenSpesialises = {"Rekayasa Perangkat Lunak", "Jaringan Komputer", "Sains Data", "Pemrograman Mobile", "Basis Data"};

        for (int i = 0; i < mahasiswaNims.length; i++) {
            Mahasiswa mhs = new Mahasiswa();
            mhs.setNim(mahasiswaNims[i]);
            mhs.setNama(mahasiswaNames[i]);
            mhs.setJurusan(mahasiswaJurusan[i]);
            Mahasiswas.add(mhs);
        }

        for (int i = 0; i < dosenNidns.length; i++) {
            Dosen dsn = new Dosen();
            dsn.setNidn(dosenNidns[i]);
            dsn.setNama(dosenNames[i]);
            dsn.setSpesialis(dosenSpesialises[i]);
            Dosens.add(dsn);
        }

        for (int i = 0; i < Mahasiswas.size(); i++) {
            Mahasiswa mhs = Mahasiswas.get(i);

            System.out.printf("Object mhs%d%n", i + 1);
            System.out.printf("Nim\t\t: %s%n", mhs.getNim());
            System.out.printf("Nama\t: %s%n", mhs.getNama());
            System.out.printf("Jurusan\t: %s%n", mhs.getJurusan());

            if (i == (Mahasiswas.size() - 1)) {
                break;
            }

            System.out.println("----------------------");
        }

        System.out.println();

        for (int i = 0; i < Dosens.size(); i++) {
            Dosen dsn = Dosens.get(i);

            System.out.printf("Object dsn%d%n", i + 1);
            System.out.printf("Nidn\t\t: %s%n", dsn.getNidn());
            System.out.printf("Nama\t\t: %s%n", dsn.getNama());
            System.out.printf("Spesialis\t: %s%n", dsn.getSpesialis());

            if (i == (Dosens.size() - 1)) {
                break;
            }

            System.out.println("----------------------");
        }
    }
}
