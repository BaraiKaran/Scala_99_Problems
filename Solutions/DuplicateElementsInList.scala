
// Problem #14 Duplicate the elements of a list.

def duplicateElements[A](list: List[A]) : List[A] = {
  list flatMap { x=> List(x,x) }
}

duplicateElements(List(1,2,3,4))


// Problem #15 Duplicate the elements of a list a given number of times.

def duplicateElementsTimes[A](times: Int , list: List[A]) : List[A] = {
  list flatMap { x=> List.fill(times)(x) }
}

duplicateElementsTimes(3,List(1,2,3,4))

