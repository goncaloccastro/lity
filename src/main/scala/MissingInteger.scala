class MissingInteger {
  def solution(a: Array[Int]): Int = {
    (1 to a.size diff a.filter(_ > 0)).find(_ => true).getOrElse(if(a.last <=
      0) 1 else a.last + 1)
  }
}
