fun main() {
    afficherNombresPairs(5)
    afficherNombresImpairs(5)
    afficherFibonacci(8)
    println(calculerFactoriel())
    println(calculerFactoriel(5))
    afficherNombresPremiers(6)
}

fun afficherNombresPairs(n: Int) {
    var count = 0
    var number = 0
    while (count < n) {
        if (number % 2 == 0) {
            print("$number ")
            count++
        }
        number++
    }
}

fun afficherNombresImpairs(n: Int) {
    var count = 0
    var number = 1
    while (count < n) {
        if (number % 2 != 0) {
            print("$number ")
            count++
        }
        number++
    }
}

fun afficherFibonacci(n: Int) {
    var n1 = 0
    var n2 = 1
    
    for (i in 1..n) {
        print("$n1 ")
        val sum = n1 + n2
        n1 = n2
        n2 = sum
    }
}

fun calculerFactoriel(nombre: Int = 10): Long {
    var resultat = 1L
    for (i in 1..nombre) {
        resultat *= i
    }
    return resultat
}

fun estPremier(n: Int): Boolean {
    if (n <= 1) return false
    for (i in 2..n/2) {
        if (n % i == 0) return false
    }
    return true
}

fun afficherNombresPremiers(n: Int) {
    var count = 0
    var number = 2
    while (count < n) {
        if (estPremier(number)) {
            print("$number ")
            count++
        }
        number++
    }
}
