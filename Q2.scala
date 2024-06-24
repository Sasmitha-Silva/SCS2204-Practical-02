@main
def main(): Unit = {

  var a: Int = 2
  var b: Int = 3
  var c: Int = 4
  var d: Int = 5
  var k: Float = 4.3f

  // (a) --b * a + c * d--
  b -= 1
  println(s"--b * a + c * d-- : ${b * a + c * d}")
  d -= 1

  // (b) a++  [There is no post-increment in Scala]
  println(s"a++ : $a")
  a += 1

  // (c) –2 * ( g – k ) + c
  println(s"-2 * ( g - k ) + c : ${-2 * (a - k) + c}")
  // Assume that there is a typo (a = g)

  // (d) c = c++
  println(s"c = c++ : $c")
  c += 1

  // (e) c = ++c * a++
  c += 1
  c = c * a
  a += 1
  println(s"c = ++c * a++ : $c")
}
