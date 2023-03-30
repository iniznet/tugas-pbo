package id.my.niznet.tugas1

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val mahasiswas = ArrayList<Mahasiswa>()
        val dosens = ArrayList<Dosen>()

        val mhs1 = Mahasiswa()
        mhs1.nim = "111"
        mhs1.nama = "Bayu"
        mhs1.jurusan = "Informatika"
        val mhs2 = Mahasiswa()
        mhs2.nim = "222"
        mhs2.nama = "Beni"
        mhs2.jurusan = "Kimia"
        val mhs3 = Mahasiswa()
        mhs3.nim = "333"
        mhs3.nama = "Reza"
        mhs3.jurusan = "Filsafat"
        val mhs4 = Mahasiswa()
        mhs4.nim = "444"
        mhs4.nama = "Rahmat"
        mhs4.jurusan = "Biologi"
        val mhs5 = Mahasiswa()
        mhs5.nim = "555"
        mhs5.nama = "Roni"
        mhs5.jurusan = "Matematika"

        mahasiswas.add(mhs1)
        mahasiswas.add(mhs2)
        mahasiswas.add(mhs3)
        mahasiswas.add(mhs4)
        mahasiswas.add(mhs5)

        val dsn1 = Dosen()
        dsn1.nidn = "111"
        dsn1.nama = "Asep"
        dsn1.spesialis = "Rekayasa Perangkat Lunak"
        val dsn2 = Dosen()
        dsn2.nidn = "222"
        dsn2.nama = "Bobon"
        dsn2.spesialis = "Jaringan Komputer"
        val dsn3 = Dosen()
        dsn3.nidn = "333"
        dsn3.nama = "Candra"
        dsn3.spesialis = "Sains Data"
        val dsn4 = Dosen()
        dsn4.nidn = "444"
        dsn4.nama = "Deden"
        dsn4.spesialis = "Pemrograman Mobile"
        val dsn5 = Dosen()
        dsn5.nidn = "555"
        dsn5.nama = "Endra"
        dsn5.spesialis = "Basis Data"

        dosens.add(dsn1)
        dosens.add(dsn2)
        dosens.add(dsn3)
        dosens.add(dsn4)
        dosens.add(dsn5)

        for (i in mahasiswas.indices) {
            val mhs = mahasiswas[i]

            println(String.format("Object mhs%d", i + 1))
            println(String.format("Nim\t\t: %s", mhs.nim))
            println(String.format("Nama\t: %s", mhs.nama))
            println(String.format("Jurusan\t: %s", mhs.jurusan))

            if (i == mahasiswas.size - 1) {
                break
            }

            println("----------------------")
        }

        for (i in dosens.indices) {
            val dsn = dosens[i]

            println(String.format("Object dsn%d", i + 1))
            println(String.format("Nidn\t\t: %s", dsn.nidn))
            println(String.format("Nama\t\t: %s", dsn.nama))
            println(String.format("Spesialis\t: %s", dsn.spesialis))

            if (i == dosens.size - 1) {
                break
            }

            println("----------------------")
        }
    }
}