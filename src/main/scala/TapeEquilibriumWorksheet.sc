/*
def solution(a: Array[Int]): Int = {
  solutionList(0,a.toList).reduceOption(_ min _).getOrElse(0)
}


def solutionList(elem:Int, list:List[Int]):List[Int] = list match {
  case x :: xs => math.abs((x + elem) - xs.sum) +: solutionList(x + elem,list.tail)
  case _ => List()
}

/*
def solutionIterative(list:List[Int]):List[Int] = {
  val sumElements = list.sum

}
*/

val testList = List(3,1,2,4,3)
val testList2 = List(-3,1,5,-2)
val testList3 = List(-10, -5, -3, -4, -5)



solutionList(0,Nil)
solutionList(0,testList2)
solutionList(0,testList3)*/

