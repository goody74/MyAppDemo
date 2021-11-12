import kotlin.collections.MutableSet


fun main(args: Array<String>) {

/* Initialazing our set*/
    val alphabet = mutableSetOf<Char>()

/* creating set of english alphabet */
    for (c in 'A'..'Z') alphabet += c

/* Searching if index of the items odd then print it */
    for (index in 1..alphabet.size.toInt()) run {

        if (index % 2 == 0) print("${alphabet.elementAt(index - 1)} ")

    }
    println()

}


