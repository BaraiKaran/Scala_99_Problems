
// Problem #1:  Finding the last element of list

def lastElementOfList(list : List[Int]) : Int = list match {
  case Nil => 0
  case x::Nil => x
  case x::xs => lastElementOfList(xs)
}
lastElementOfList(List(1,2,3,4,5,6,7))

