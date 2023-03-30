package id.my.niznet.tugas2

class Segitiga(private val alas: Double, private val tinggi: Double) : BangunDatar {
    override fun luas(): Double {
        return alas * tinggi / 2
    }

    override fun keliling(): Double {
        return 0.0
    }
}