

def reverse[A](ls: List[A]) : List[A] = {
  def reverseFunction(res: List[A], list: List[A]) : List[A] = list match {
    case Nil => res
    case h :: t => reverseFunction(h :: res, t)
  }
  reverseFunction(Nil, ls)
}

reverse(List(1,2,3))
