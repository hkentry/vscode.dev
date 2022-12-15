fun main() {
  var counter = 0
  var previous = readLine().toString().toInt()
  while (true) {
      var depth = readLine().toString().toIntOrNull()
      if (depth == null)
        break
      if (depth > previous)
        counter++
      previous = depth
    }
  println(counter)
}