package id.my.niznet.tugas2

class Lingkaran(private val jariJari: Double) : BangunDatar {
    override fun luas(): Double {
        return Math.PI * jariJari * jariJari
    }

    override fun keliling(): Double {
        return 2 * Math.PI * jariJari
    }
}