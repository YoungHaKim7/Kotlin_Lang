// 성능상 우위를 가져옴 
// compile time 상수라 fun main 보다 우선적으로 compile됨 
const val num = 20

fun main() {
  var i : Int = 10
  var name : String = "GY"
  var point : Double = 3.3

  println(i)
  println(name)
  println(point)
}


