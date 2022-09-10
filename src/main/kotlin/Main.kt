import java.util.*;

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}
fun main() {
    fun increaseDirty( start: Int ) = start + 1

    println(updateDirty(15, ::increaseDirty))
}



