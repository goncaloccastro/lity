/**
  * Created by goncalocastro on 11/08/2016.
  */
class TapeEquilibrium {
  def solution(a: Array[Int]): Int = {
    solutionList(0, a.toList).reduceOption(_ min _).getOrElse(0)
  }

  def solutionList(acc:Int, list:List[Int]): List[Int] = list match {
      case x :: xs => math.abs((x + acc) - xs.sum) +: solutionList(x + acc,list.tail)
      case _ => List()
    }

  def solutionListTail(res:Int, acc:Int, list:List[Int]): List[Int] = list
  match {
      case x :: xs => solutionListTail(math.abs((x + acc) - xs.sum),x +
        acc,
        list.tail)
      case _ => List()
    }
}
