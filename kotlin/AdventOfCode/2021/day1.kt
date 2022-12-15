fun main() {
  while true {
    previous = getLine().toString().toInt()
    counter = 0
    while (depth = getLine().toString().toInt()) {
      if (depth > previous)
        counter++
    }
  }
  println(counter)
}