package id.my.niznet.tugas1

open class Person : Human {
    var nama: String? = null
        get() {
            return camelCase(field ?: "")
        }
        set(value) {
            field = camelCase(value ?: "")
        }
    var alamat: String? = null
    override fun jalan() {}
    override fun makan() {}
    override fun tidur() {}

    private fun camelCase(string: String, delimiter: String = " "): String {
        return string.split(delimiter).joinToString("") {
            it.lowercase().replaceFirstChar { char -> char.uppercase() }
        }
    }
}