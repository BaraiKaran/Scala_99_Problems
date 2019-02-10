
// Problem #31 Determine whether a given integer number is prime.

def isPrime(num: Int) : Boolean = {
  (2 to num-1) forall (x=> num%x != 0)
}

isPrime(30)


def isPrimeList(list: List[Int]) : List[Int] = {
  list.filter(x=> (2 to x-1) forall (y=>x%y!=0))
}
isPrimeList(List(10,13,20))

