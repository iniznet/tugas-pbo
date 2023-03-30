package id.my.niznet.tugas2

class PersegiPanjang(private val panjang: Double, private val lebar: Double) : BangunDatar {
    override fun luas(): Double {
        return panjang * lebar
    }

    override fun keliling(): Double {
        return 2 * (panjang + lebar)
    }
}