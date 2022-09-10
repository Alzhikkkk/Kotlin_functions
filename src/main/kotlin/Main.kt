import java.util.*;

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}
fun main() {
    var dirtyLevel = 19
    dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23}
    println(dirtyLevel)
}



