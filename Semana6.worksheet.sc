//Funcion para calcular la desviacion estandar de un grupo de numeros
val nros = List(727.7, 1086.5, 1091.0, 1361.3, 1490.5,1956.1)
def promedio(valores: List[ Double]): Double = valores.sum / valores.size
def desvEst(valores:List[Double]): Double = { 
   val avg = promedio(valores)
   def varianza(valores: List[Double]): Double = 
         valores.map(x=> Math.pow(x-avg,2)).sum* (1.0 / (valores.size-1))
   Math.sqrt(varianza(valores ))
}
promedio(nros)
desvEst(nros)
//2204924328

//Contar cuantos elementos hay en cada grupo
def clasifica(valores: List[Double]) : Unit = { 
    val s = desvEst(valores)
    val avg = promedio(valores)
    (1 to 3).foreach(i =>
        println(valores.filter( x =>
        x >= (avg - i * s) && x <= (avg + i * s)).size))
}
clasifica(nros)
// TUPLAS
//Una tupla puede ser un contenedor de datos en donde cada elemento  puede ser de diferente tipo .
val par = (1, "Abad Ana")
//Se puede acceder a cada elemento de forma independiente , utilizando punto guion bajo y un indice
println(par._1)
println(par._2)
//Como declarar su tipo depende del numero de elementos y el tipo de dato de cada uno
val student = (1, "Abad Ana")
//val student: Tuple2[Int, String]
val datos= ("jorgaf", "M", 45, 95.2, true)
//val datos: Tuple5[String, Char, Int, Double, Boolean]
//Ejercicios de algunas funciones
val(edad,nombre)= student
println(edad)
println(nombre)
student.swap //Cambiar orden
student.canEqual((1, "Abad Ana")) // Si el parametro dato es igual a la tupla dada
// Estructuras de datos funcionales
//LISTAS
val values= List(42,31,36,40,43)
val names= List("Jorde", "Rene", "Ma. del Carmen","Nelson")
val fruit: List [String] = List("apple", "orange","pears")
val nums: List [Int] = List(1,2,3,4)
//Operaciones con Listas
val myList = List(10,20,30,50,60)
myList.isEmpty
myList.drop(2)
myList.dropWhile(_<25)
myList.slice(2,4)
myList.tail
myList.take(3)
myList.takeWhile(_<30)
myList.sorted
//foldLeft: aplica un operador binario a un valor inicial y a todos los elementos de esta secuencia , de izquierda a derecha.
// el acumulador es x
myList.foldLeft(0) ((x,y)=> x +y)
myList.foldLeft(0)(_ + _)
//Mas ejercicios: Crear una funcion para calcular el promedio de los elementos de una lista de numeros reales
def average(valores: Seq[Double]) : Double = {
    val t = valores.foldLeft((0.0,0)) ((acc,valoractual) => (acc._1 +valoractual,acc._2+1))
    t._1/t._2

}
average(nros)
def average2(valores: Seq[Double]) : Double = {
      val t = valores.foldLeft((0.0,0)) { (acc,valoractual) =>
        val suma = acc._1 +valoractual
        val cont = acc._2+1 
        printf("suma: %f - contador : %d%n",suma,cont)
        (suma,cont)
}
    t._1/t._2
}
average2(nros)
//folRight: Hace lo mismo pero de derecha a izquierda 
// el acumulador es y
//ZIP: sirve pára fusionar dos colecciones el resultado es una tupla
//Unzip: Convierte esta coleccion tuplas de 2 en dos colecciones de la ´rimera y a segunda mitad de cada par
