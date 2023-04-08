package id.my.niznet.tugas1

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val mahasiswas = ArrayList<Mahasiswa>()
        val dosens = ArrayList<Dosen>()

        val mahasiswaNims = arrayOf("111", "222", "333", "444", "555")
        val mahasiswaNames = arrayOf("Bayu", "Beni", "Reza", "Rahmat", "Roni")
        val mahasiswaJurusans = arrayOf("Informatika", "Kimia", "Filsafat", "Biologi", "Matematika")

        val dosenNidns = arrayOf("111", "222", "333", "444", "555")
        val dosenNames = arrayOf("Asep", "Bobon", "Candra", "Deden", "Endra")
        val dosenSpesialises = arrayOf("Rekayasa Perangkat Lunak", "Jaringan Komputer", "Sains Data", "Pemrograman Mobile", "Basis Data")

        for (i in mahasiswaNims.indices) {
            val mhs = Mahasiswa()
            mhs.nim = mahasiswaNims[i]
            mhs.nama = mahasiswaNames[i]
            mhs.jurusan = mahasiswaJurusans[i]
            mahasiswas.add(mhs)
        }

        for (i in dosenNidns.indices) {
            val dsn = Dosen()
            dsn.nidn = dosenNidns[i]
            dsn.nama = dosenNames[i]
            dsn.spesialis = dosenSpesialises[i]
            dosens.add(dsn)
        }

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

        println()

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