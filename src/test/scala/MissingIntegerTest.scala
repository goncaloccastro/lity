import org.scalatest.FunSuite

/**
  * Created by goncalocastro on 12/08/2016.
  */
class MissingIntegerTest extends FunSuite {
  val toTest = new MissingInteger

  test("test with valid small input") {
    val in = Array(1, 3, 6, 4, 1, 2)
    val out = toTest solution(in)
    assert(out == 5)
  }

  test("test with one element") {
    val in = Array(1)
    val out = toTest solution(in)
    assert(out == 2)
  }

  test("test with medium sized input") {
    val in = Array(1,2,3,4,5,6,7,8,9,10,99)
    val out = toTest solution(in)
    assert(out == 11)
  }
}
