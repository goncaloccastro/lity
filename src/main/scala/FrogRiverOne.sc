val ar = Array(1,3,1,4,2,3,5,4)
val x = 5
val a = ar.toMap.zipWithIndex
val y = 1 to x
val slidingMap = a.sliding(ar.indexOf(x) + 1, ar.indexOf(x) + 1).toParArray
val z = slidingMap.filter(_.size > x)
val z2 = slidingMap


