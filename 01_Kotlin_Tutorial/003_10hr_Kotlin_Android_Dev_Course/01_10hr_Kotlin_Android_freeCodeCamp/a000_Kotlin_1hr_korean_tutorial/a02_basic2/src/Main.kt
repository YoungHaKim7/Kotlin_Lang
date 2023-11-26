fun main() {
  // integer
  var i = 10

  // long
  var l = 20L

  // type casting
  l = i.toLong()
  i = l.toInt()

  var name : String = i.toString()

  var str_int2 = "10"
  var int_name: Int = str_int2.toInt()
  println(int_name)

  var name03 = "hello"
  println(name03.uppercase())
  println(name03.lowercase())
}


