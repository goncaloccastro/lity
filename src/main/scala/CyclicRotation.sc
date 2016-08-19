/*
A zero-indexed array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is also moved to the first place.

For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]. The goal is to rotate array A K times; that is, each element of A will be shifted to the right by K indexes.

  Write a function:

object Solution { def solution(a: Array[Int], k: Int): Array[Int] }
that, given a zero-indexed array A consisting of N integers and an integer K, returns the array A rotated K times.

  For example, given array A = [3, 8, 9, 7, 6] and K = 3, the function should return [9, 7, 6, 3, 8].

Assume that:

  N and K are integers within the range [0..100];
each element of array A is an integer within the range [−1,000..1,000].
In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
*/


val a = Array(3, 8, 9, 7, 6)
val b = Array(1,2)

solution(a, 3).toList
solution(b,9998).toList


def solution(a: Array[Int], k: Int): Array[Int] = {
  a.splitAt((k % a.length) - 1)._2 ++ a.splitAt((k % a.length) - 1)._1
}

val testList = List(3,1,2,4,3)
val testList2 = List(-3,1,5,-2)
val testList3 = List(-10, -5, -3, -4, -5)



solutionList(0,testList2)

def solutionList(elem:Int, list:List[Int]):List[Int] = {
  list match {
    case List() => List()
    case x :: Nil => List()
    case x :: xs => math.abs((x + elem) - xs.reduce(_ + _)) +: solutionList(x + elem,list.tail)
  }
}


/*var testArray = Array(3,1,2,4,3)
Array(0, testArray)

def solutionArray(elem:Int, arry:Array[Int]):Array[Int] = {
  arry match {
    case x +: Array() => Array()
    case x +: xs =>
      ((arry(0) + elem) - xs.reduce(_ + _)) +:
      solutionArray((arry(0) + elem),arry.tail)
  }
}*/



