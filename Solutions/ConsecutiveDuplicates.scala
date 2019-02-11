
// Problem #8 Eliminate consecutive duplicates of list elements.

def consecutiveDuplicates[A](list: List[A]): List[A] = {
  def fun(ls: List[A], tail: List[A]) : List[A] = tail match {
    case Nil => ls
    case h :: t => fun(ls :+ h,t.dropWhile(_ == h))
  }
  fun(Nil, list)
}

consecutiveDuplicates(List(1,1,2,3,4))

