class Solutions {

    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false

        val num = x.toString()
        var start = 0
        var end = num.length - 1

        while (start < end) {
            if (num[start] != num[end]) return false
            start++
            end--
        }
        return true
    }

        

    }


fun main() {
    val f = Solutions()
    println(f.isPalindrome(-121))


}