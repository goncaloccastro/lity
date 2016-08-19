import org.scalatest.{Matchers, WordSpec}

/**
  * Created by goncalocastro on 10/08/2016.
  */
class BinaryGapTest extends WordSpec with Matchers{

  val bGap = new BinaryGap

  "solution" should {
    "binarygap" in {
      bGap.solution(9999999) shouldBe(3)
      bGap.solution(9999999) shouldBe(3)
      bGap.solution(9999999) shouldBe(3)
    }
  }


  "mateus" should {
    "binarygap" in {
      bGap.mateus(9999999) shouldBe(3)
      bGap.mateus(9999999) shouldBe(3)
      bGap.mateus(9999999) shouldBe(3)
    }
  }

  "solutionGC" should {
    "binarygap" in {
      bGap.solutionGC(9999999) shouldBe(3)
      bGap.solutionGC(9999999) shouldBe(3)
      bGap.solutionGC(9999999) shouldBe(3)
    }
  }

}
