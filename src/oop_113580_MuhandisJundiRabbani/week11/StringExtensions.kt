package oop_113580_MuhandisJundiRabbani.week11

//extension function dengan receiver 'this'
fun String.addGreeting(): String {
    return "hello, $this"
}

//extension function dengan parameter
fun String.repeatTimes(n: Int): String {
    return this.repeat(n)
}