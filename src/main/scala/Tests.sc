val list = List(4, 6, 7, 8, 9, 13, 14)
val partialFunction1: PartialFunction[Int, Int] = {
  case x: Int if x % 2 == 0 ⇒ x * 3
}
val partialFunction2: PartialFunction[Int, Int] = {
  case y: Int if y % 2 != 0 ⇒ y * 4
}
val result = list.collect(partialFunction1 orElse partialFunction2)


val reverse = (s: String) => s.reverse

val toUpper = (s: String) => s.toUpperCase

val appendBar = (s: String) => s + "bar"


/*def applyTransformations(initial: String, transformations: Seq[String => String]) = {
  var cur = initial
  for(transformation <- transformations) {
    cur = transformation(cur)
  }
  cur
}*/

def applyTransformations2(initial: String, transformations: Seq[String =>
  String]) =
  transformations.foldLeft(initial) {
    (cur, transformation) => transformation(cur)
  }

applyTransformations2("foo", List(reverse, toUpper, appendBar))
applyTransformations2("foo", List(appendBar, reverse, toUpper))
applyTransformations2("foo", List.fill(7)(appendBar))

val l1= List(0, 3, 6, 12, 14, 15, 16, 17)
val l2 = l1.take(l1.size - 1).zip(l1.tail)

val list2 = List(4, 6, 7, 8, 9, 13, 14)
val result2 = list2.toStream
result2.take(3)
