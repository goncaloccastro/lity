def oddOccur(A: Array[Int]): Int = {
  (for {
    a <- A.groupBy(identity).mapValues(_.size)
    if(a._2 % 2 == 1)
  } yield a._1).last
}

val x = Array(1,1,2,3,2)

oddOccur(x)