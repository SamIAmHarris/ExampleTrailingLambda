package com.milomobile.exampletrailinglambda


fun thirdParam(a: Int, b: Int) : Unit {

}

fun runMath(first: Int, second: Int, mathAction: (a: Int, b: Int) -> Unit) {
    mathAction(first, second)
}

fun example() {
    runMath(1, 3) { first: Int, second: Int ->
        first * second
    }
}