

// Problem #3:  Finding the kth element of a list

def KthElementOfList(n: Int,list : List[Int]) : Int = {
  if (n >= 0 && n < list.length) list(n)
  else throw new NoSuchElementException
}

KthElementOfList(2,List(1,2,3))

