package id.my.niznet.tugas2

import java.util.*

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        val bentuk: MutableMap<String, BangunDatar> = HashMap()

        println("==================================")
        println("Program Menghitung Luas dan Keliling Bangun Datar")
        println("==================================")

        println("Segitiga")
        print("Masukkan alas: ")
        val alas = input.nextDouble()
        print("Masukkan tinggi: ")
        val tinggi = input.nextDouble()
        bentuk["Segitiga"] = Segitiga(alas, tinggi)
        println()

        println("Persegi Panjang")
        print("Masukkan panjang: ")
        val panjang = input.nextDouble()
        print("Masukkan lebar: ")
        val lebar = input.nextDouble()
        bentuk["Persegi Panjang"] = PersegiPanjang(panjang, lebar)
        println()

        println("Lingkaran")
        print("Masukkan jari-jari: ")
        val jariJari = input.nextDouble()
        bentuk["Lingkaran"] = Lingkaran(jariJari)
        println()

        println("Persegi")
        print("Masukkan sisi: ")
        val sisi = input.nextDouble()
        bentuk["Persegi"] = Persegi(sisi)
        println()

        input.close()
        println("==================================")
        println()

        println("Hasil")
        for (key in bentuk.keys) {
            println(key)
            println("Luas: " + bentuk[key]!!.luas())
            println("Keliling: " + bentuk[key]!!.keliling())
        }
    }
}