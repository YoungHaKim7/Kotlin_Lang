fun main() {
  val i = 5

  var result = when {
      i > 10 -> {
        "10 보다 크다"
      }
      i > 5 -> {
        "5 보다 크다"
      }
      else -> {
        "!!!!!"
      }
  }
  print(result)

  print('\n')
}
