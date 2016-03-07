import org.scalatest.FlatSpec

/**
  * Created by amos.zhou on 2016/3/4.
  */
class BugTest extends FlatSpec {

  " An empty Set" should " have size 0 " in {
    assert(Set.empty.size == 0)
  }
}
