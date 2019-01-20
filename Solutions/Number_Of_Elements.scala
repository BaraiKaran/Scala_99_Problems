
// Problem #4 : Find the number of elements of a list.

def numberOfElementsInList(list: List[Int]) : Int = list.map(x=>x/x).sum
numberOfElementsInList(List(1,2,3,4))

// more functional solution
def lengthFunctional[A](ls:List[A]): Int = ls.foldLeft(0) { (c,_)=>c+1 }

