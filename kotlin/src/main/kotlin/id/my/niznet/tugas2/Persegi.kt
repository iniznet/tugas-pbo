package id.my.niznet.tugas2

class Persegi(private val sisi: Double) : BangunDatar {
    override fun luas(): Double {
        return sisi * sisi
    }

    override fun keliling(): Double {
        return 4 * sisi
    }
}