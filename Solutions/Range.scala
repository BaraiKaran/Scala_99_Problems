

// Problem #22 : Create a list containing all integers within a given range.

// Using yield

def range(start : Int,end : Int) : List[Int]  = {
  for (i <- (start to end).toList) yield i
}

range(1,4)

// Tail Recursive

def rangeTR(start: Int, end: Int): List[Int] = {
  def range(end: Int, result: List[Int]): List[Int] = {
    if (end < start) result
    else range(end - 1, end :: result)
  }
  range(end, Nil)
}

rangeTR(1,4)
