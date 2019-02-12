

// Problem #18 Extract slice of a list 

def slice(start: Int, end: Int, list: List[Int]): List[Int] = {
  list.zipWithIndex.filter(x=> (x._2 >= start && x._2 <=end)).map(_._1)
}
slice(1,4,List(1,2,3,4,5,6))

def sliceTR(start: Int, end: Int,list: List[Int]) : List[Int] = {
  def sliceInner(count: Int, tail: List[Int], output: List[Int]): List[Int] = tail match {
    case Nil=> output
    case h :: t if(count>=start && count<=end) =>  sliceInner(count+1, t, output :+ h)
    case h ::t => sliceInner(count+1,t,output)
  }
  sliceInner(0,list,List())
}

sliceTR(0,1,List(1,2,3,4,5))
