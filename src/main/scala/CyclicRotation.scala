/**
  * Created by goncalocastro on 10/08/2016.
  */
class CyclicRotation {
  def solution(a: Array[Int], k: Int): Array[Int] = {
    if(k == 0) a
    val rotatedArray = a.splitAt(k % a.length)
    rotatedArray._2 ++ rotatedArray._1
  }
}
