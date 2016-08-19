/**
  * Created by goncalocastro on 11/08/2016.
  */
class PermMissingElem {
  def solution(a: Array[Int]): Int = {
    (1 to (a.size + 1)).toSet.diff(a.toSet).reduceOption(_ + _).getOrElse(1)
  }
}
