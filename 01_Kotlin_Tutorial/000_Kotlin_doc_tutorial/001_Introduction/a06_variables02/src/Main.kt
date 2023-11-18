fun someCondition(): Boolean {
  // Implement the logic of the someCondition function here
  return true
}

fun main() {
  val z: Int

  if (someCondition()) {
    z = 1
  } else {
    z = 2
  }

  if (z != null) { // Check if z has been assigned a value
    println(z)
  } else {
    println("Error: z is not initialized")
  }
}