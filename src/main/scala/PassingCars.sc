import scala.annotation.tailrec

val a = Array(0,1,0).toList


@tailrec
def test(accZeroes:Int, accPassing:Int, list:List[Int]): Int = list match {
  case Nil => accPassing + accZeroes
  case 0 :: xs => test(accZeroes + 1, accPassing, xs)
  case 1 :: xs => test(accZeroes, accZeroes + accPassing, xs)
}

test(0, 0, a)

