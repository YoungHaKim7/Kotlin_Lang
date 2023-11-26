fun main() {
  val items = listOf(1,2,3,4,5)

  //(java) for (int i = 0; i < items.lenth; i++)
  for (i in 0..items.size-1) {
    print(items[i])
  }
  print('\n')
}


