import org.scalameter.{Bench, Gen}

import scala.annotation.tailrec

/**
  * Created by goncalocastro on 10/08/2016.
  */

 class BinaryGap extends Bench.LocalTime {

  def solutionGC(n: Int): Int = {
    val binaryN = n.toBinaryString.map(_.asDigit).toList
    test(binaryN)
  }

  def test(binaryList: List[Int]): Int = {
    val y = (binaryList.size to 3 by -1).map { x =>
      binaryList.sliding(x).toList.map(list =>
        if (list.head == 1 && list.last == 1 && list.sum == 2) (list.size - 2)
        else 0
      )
    }
    y.flatten.reduceOption(_ max _).getOrElse(0)
  }

  def solution(n: Int): Int = {
    val binary = toBinary(n).toList


    @tailrec
    def loop(binary: List[Char], consecutiveZeroCount: Int, maxCount: Int): Int = binary match {
      case Nil => maxCount
      case '1' :: xs => {
        if (consecutiveZeroCount > maxCount) loop(xs, 0, consecutiveZeroCount)
        else loop(xs, 0, maxCount)
      }
      case '0' :: xs => loop(xs, consecutiveZeroCount + 1, maxCount)
      case _ => -1
    }

    loop(binary.tail, 0, 0)
  }


  def mateus(N: Int) = {
    val n = N.toBinaryString
    val last1 = n.lastIndexOf("1")
    val nn = if (last1 == 0) "1" else n.substring(0, last1)
    val ns = nn.split("1")
    if (ns.length == 0) 0
    else {
      ns.foldLeft(0)((a, b) => if (a >= b.length) a else b.length)
    }
  }

  def testTime(tests: List[Int])(solution: Int => Int)(timeStamp: => Long) = {
    var timeTaken = System.nanoTime()


    tests.map(i => {
      timeTaken = timeStamp
      val result = solution(i)
      timeTaken = timeStamp - timeTaken
      (s"For input <$i>", s" which yielded <$result>", s" it took <$timeTaken> nano seconds")
    })
  }

  def toBinary(x: Int): String = {

    def loop(x: Int, total: String): String = {
      if (x <= 1) x + total
      else loop(x / 2, (x % 2) + total)
    }

    loop(x, "")
  }
// Scalameter does not work
/*  val sizes = Gen.range("size")(1, 1000, 10)
  val ranges = for {
    size <- sizes
  } yield 0 until size
  sizes.map(println(_))
  ranges.map(_.foreach(println(_)))

  performance of "BinaryGap" in {
    measure method "solution" in {
      using(ranges) in {
        r => r.map(x => x)
      }
    }
  }*/
}
