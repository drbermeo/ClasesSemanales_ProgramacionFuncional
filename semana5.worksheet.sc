//Ejercicios Mapeos
//Mapear una lista de cadena de texto a ñista de enteros que representan la longitud del texto
val names: List[String] = List ("Leo", "Cristiano","Enner","Felipe")
names.map(_.length)
//dada una lista de enteros desarrollar las funciones que le permitan contar cuentos elementos d ela lista son numeros primos
val numbers = List(3,4,7,11,12)
val isPrime = (nro:Int) => ( 2 to nro -1).forall(nro % _!= 0)
numbers.map(isPrime(_)match {
    case true => 1
    case false =>0
    }).sum
//Filtrar y truncar secuencias
//sum, product,map,forall
//funciones de orden superior
//max,min,size,
//exists,filter,takeWhile reciben como parametro un predicado 
//EJERCICIOS
val number = List (6,28,15,12,11,24)
number.max
number.min
number.size
//forall: devuelve true si y solo si el predicado devuelve true para todos los valores de la lista
//exists: devuelve true si y solo si el predicado devuekve true para por lo menos un valor de la lista
//filter devuelve una lista que unicamente contiene los valores que cumplen con el predicado
List(1,2,3,4,5).filter( k => k%3 != 0)
//takeWhile trunca la lista cuando encuentra un valor que no cumplen con  el predicado
List(1,2,3,4,5).takeWhile( k => k%3 != 0)
//MAS EJERCICIOS MAP/REDUCE
//transformar, una funcion toma una lista y devuelve otra.
//Agregar, toma una lista y devuelve un unico valor
//Escribir programas que concatenan transformaciones y agregaciones se conocen como programacion map/reduce

val divp =(n:Int)=>(1 until n).filter(div => n % div == 0 )
val x = divp(6).sum 
val numberss = List(6,28,15,12,11,24)
val sumDiv =(n:Int)=>(1 until n).filter(div => n % div == 0 ).sum
//Cuantos numeros de elementos de la lista son perfectos
numberss.filter(nro=>  nro == sumDiv(nro)).size
//Cuantos numeros de elementos de la lista son deficientes
numberss.filter(nro=>  nro > sumDiv(nro)).size
//Cuantos numeros de elementos de la lista son abundantes
numberss.filter(nro=>  nro < sumDiv(nro)).size
//Factorial Escalonado
def !! (n:Int): Int = {
    n%2 match {
        case 0 => ((2 to n by 2 )).product
        case _ => ((1 to n by 2 )).product  
        }
}
!!(8)
!!(9)

val numberrs = (1 to 20).toList
//CONTAR PARES
numberrs.filter(nro => nro % 2 == 0).size
//otra forma
numberrs.count(nro => nro % 2 == 0)
//CONTAR IMPARES
numberrs.filter(nro => nro % 2 != 0).size
//CONTAR PRIMOS
def contarPrimos(nros: List[Int] ): Int = {
 val isPrime = (n:Int) => ( 2 until n).forall(n % _!= 0)
 nros.filter(isPrime).size
}
contarPrimos(numberrs)
//Presentar tres factores
def tresFactores (nros: List[Int] ): List[Int] = {
     val factores = (n:Int) => ( 2 until n).filter(n % _ == 0)
     nros.filter( nro => factores(nro).size == 3)
    }
    tresFactores((1 to 1000).toList)