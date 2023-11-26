fun main() {
  val items = listOf(1,2,3,4)
  val test_val = items[6]

  try {
    val item = test_val
  } catch (e: Exception) {
    print(e.message)
  }
  print('\n')
}


