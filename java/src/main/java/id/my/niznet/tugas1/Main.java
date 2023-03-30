package id.my.niznet.tugas1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> Mahasiswas = new ArrayList<Mahasiswa>();
        ArrayList<Dosen> Dosens = new ArrayList<Dosen>();

        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setNim("111");
        mhs1.setNama("Bayu");
        mhs1.setJurusan("Informatika");
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.setNim("222");
        mhs2.setNama("Beni");
        mhs2.setJurusan("Kimia");
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.setNim("333");
        mhs3.setNama("Reza");
        mhs3.setJurusan("Filsafat");
        Mahasiswa mhs4 = new Mahasiswa();
        mhs4.setNim("444");
        mhs4.setNama("Rahmat");
        mhs4.setJurusan("Biologi");
        Mahasiswa mhs5 = new Mahasiswa();
        mhs5.setNim("555");
        mhs5.setNama("Roni");
        mhs5.setJurusan("Matematika");

        Mahasiswas.add(mhs1);
        Mahasiswas.add(mhs2);
        Mahasiswas.add(mhs3);
        Mahasiswas.add(mhs4);
        Mahasiswas.add(mhs5);

        Dosen dsn1 = new Dosen();
        dsn1.setNidn("111");
        dsn1.setNama("Agung");
        dsn1.setSpesialis("Rekayasa Perangkat Lunak");
        Dosen dsn2 = new Dosen();
        dsn2.setNidn("222");
        dsn2.setNama("Bobon");
        dsn2.setSpesialis("Jaringan Komputer");
        Dosen dsn3 = new Dosen();
        dsn3.setNidn("333");
        dsn3.setNama("Candra");
        dsn3.setSpesialis("Sains Data");
        Dosen dsn4 = new Dosen();
        dsn4.setNidn("444");
        dsn4.setNama("Deden");
        dsn4.setSpesialis("Pemrograman Mobile");
        Dosen dsn5 = new Dosen();
        dsn5.setNidn("555");
        dsn5.setNama("Endra");
        dsn5.setSpesialis("Basis Data");

        Dosens.add(dsn1);
        Dosens.add(dsn2);
        Dosens.add(dsn3);
        Dosens.add(dsn4);
        Dosens.add(dsn5);

        for (int i = 0; i < Mahasiswas.size(); i++) {
            Mahasiswa mhs = Mahasiswas.get(i);

            System.out.println(String.format("Object mhs%d", i + 1));
            System.out.println(String.format("Nim\t\t: %s", mhs.getNim()));
            System.out.println(String.format("Nama\t: %s", mhs.getNama()));
            System.out.println(String.format("Jurusan\t: %s", mhs.getJurusan()));

            if (i == (Mahasiswas.size() - 1)) {
                break;
            }

            System.out.println("----------------------");
        }

        for (int i = 0; i < Dosens.size(); i++) {
            Dosen dsn = Dosens.get(i);

            System.out.println(String.format("Object dsn%d", i + 1));
            System.out.println(String.format("Nidn\t\t: %s", dsn.getNidn()));
            System.out.println(String.format("Nama\t\t: %s", dsn.getNama()));
            System.out.println(String.format("Spesialis\t: %s", dsn.getSpesialis()));

            if (i == (Dosens.size() - 1)) {
                break;
            }

            System.out.println("----------------------");
        }
    }
}
