val list = List(5, 4, 3, 2, 1)
val result = (0 /: list) {
  (`running total`, `next element`) ⇒ `running total` - `next element`
}