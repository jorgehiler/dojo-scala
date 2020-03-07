object ejercicio {
  def main(args: Array[String]): Unit = {

    val numeros = List(4, 8, 15, 16, 23, 42);
    println(numeros.map{n => print(n*2)});

    def factorial(n: Int): Int =
        if(n==0) 1 else n*factorial(n-1)

    print(factorial(3))


  }

}
