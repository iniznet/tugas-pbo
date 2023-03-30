package id.my.niznet.tugas1;

public class Person implements Human {
    public String nama, alamat;

    @Override
    public void jalan() {}

    @Override
    public void makan() {}

    @Override
    public void tidur() {}

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
