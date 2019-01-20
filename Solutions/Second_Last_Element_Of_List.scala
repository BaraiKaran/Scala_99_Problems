
// Problem #2:  Finding the second last element of the list


def SecondlastElementOfList(list : List[Int]) : Int = list match {
  case Nil => 0
  case x::Nil => x
  case x::xs => if (xs.size ==1) x else  SecondlastElementOfList(xs)
}
SecondlastElementOfList(List(1,2,3,4,5,6,7))

